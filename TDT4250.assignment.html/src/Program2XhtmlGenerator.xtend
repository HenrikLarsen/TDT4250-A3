import java.io.IOException
import java.util.Arrays
import org.eclipse.emf.common.util.URI
import java.io.PrintStream
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.EObject

import com.google.common.collect.Iterators
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.PrintStream
import java.util.Arrays
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.XMLResource
import org.w3c.xhtml1.HtmlType
import org.w3c.xhtml1.InputType
import org.w3c.xhtml1.Xhtml1Factory
import org.w3c.xhtml1.util.Xhtml1ResourceFactoryImpl

import Program.Program
import Program.ProgramPackage
import Program.util.ProgramResourceFactoryImpl
import Program.Department
import Program.Specialization
import Program.Semester
import Program.SemesterCourse

class Program2XhtmlGenerator {
	Xhtml1ResourceFactoryImpl xhtml1ResourceFactoryImpl = new Xhtml1ResourceFactoryImpl
	
	def String generateHtml(Department department) {
		val encoding = "UTF-8"
		val html = generateHtmlType(department);
//		val root = XMLNamespaceFactory.eINSTANCE.createXMLNamespaceDocumentRoot += html
		val fileName = (if (department.name !== null) department.name.replace('.', '/') else "department")+ '.html'
		val resource = xhtml1ResourceFactoryImpl.createResource(URI.createFileURI(fileName)) as XMLResource
		resource.getDefaultSaveOptions().put(XMLResource.OPTION_ENCODING, encoding);
		resource.contents += html
		val outputStream = new ByteArrayOutputStream(4096)
		resource.save(outputStream, null)
		val originalOutput = outputStream.toString(encoding)
		originalOutput.cleanHtml
	}
	
	def cleanHtml(String html) {	
		html
			.replace("xhtml:", "")
			.replace("html_._type", "html")
			.replace("xmlns:xhtml=", "xmlns=")
			.replace("&lt;", "<")
			.replace("&gt;", ">")
			.replace("&amp;", "&")
			.replace("&quot;", "'")
	}
	
	extension Xhtml1Factory xhtml1Factory = Xhtml1Factory.eINSTANCE
	extension XhtmlUtil xhtmlUtil = new XhtmlUtil
	
	def HtmlType generateHtmlType(Department department) {
		val html = createHtmlType => [
			head = createHeadType => [
				title = createTitleType => [
					it += department.name
				]
				meta += createMetaType => [
					httpEquiv = "content-type"
					content = "text/html; charset=UTF-8"
				]
			]
			body = createBodyType => [
				for (program : department.programs) {
					it += generate(program)
				}
			]
		]
		html
	}
	
	def dispatch Iterable<? extends EObject> generate(Program program) {
		#[
			createHrType,
			createH2Type => [ it += program.name + " " + program.year + " year"],
			createDivType => [
				id = program.name
				for (spec : program.specializations) {
					it += generate(spec)
				}
			]
		]
	}
	
	def dispatch Iterable<? extends EObject> generate(Specialization spec) {
		#[
			createHrType,
			createH3Type => [ it += spec.name ],
			createDivType => [
				id = spec.name
				for (semester : spec.semesters) {
					it += generate(semester)
				}
			]
		]
	}
	
	
	def dispatch Iterable<? extends EObject> generate(Semester semester) {
		#[
			createHrType,
			createH4Type => [ it += "Semester: " + semester.code + " " + semester.status ],
			createDivType => [
				id = semester.code
				for (course : semester.semesterCourses) {
					it += generate(course)
				}
			]
		]
	}
	
	def dispatch Iterable<? extends EObject> generate(SemesterCourse sc) {
		#[
			createHrType,
			createDivType => [
				id = sc.course.code
				it += #[
					createPType => [ it += "Code: " + sc.course.code ],
					createPType => [ it += "Name: " + sc.course.name ],
					createPType => [ it += "Credit: " + sc.course.credit ]
				]
				
			]
		]
		
	}

   	
	def static void main(String[] args) throws IOException {
		val argsAsList = Arrays.asList(args)
		val department = if (argsAsList.size > 0) getDepartment(argsAsList.get(0)) else getSampleDepartment();
		val html = new Program2XhtmlGenerator().generateHtml(department);
		if (args.length > 1) {
			val target = URI.createURI(argsAsList.get(1));
			val ps = new PrintStream(department.eResource().getResourceSet().getURIConverter().createOutputStream(target))
			ps.print(html);
		} else {
			System.out.println(html);
		}
	}

	def static Department getDepartment(String uriString) throws IOException {
		val resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(ProgramPackage.eNS_URI, ProgramPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("program", new ProgramResourceFactoryImpl());
		val resource = resSet.getResource(URI.createURI(uriString), true);
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof Department) {
				return eObject as Department;
			}
		}
		return null;
	}

	def static Department getSampleDepartment() {
		try {
			return getDepartment(Program2XhtmlGeneratorMain.getResource("SampleProgram.program").toString());
		} catch (IOException e) {
			System.err.println(e);
			return null;
		}
	}


}