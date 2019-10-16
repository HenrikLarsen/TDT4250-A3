import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import Program.Department;
import Program.ProgramPackage;
import Program.util.ProgramResourceFactoryImpl;

public class Program2XhtmlGeneratorMain {
	public static void main(String[] args) throws IOException {
		Department department = (args.length > 0 ? getDepartment(args[0]) : getSampleDepartment());
		String html = new Program2XhtmlGenerator().generateHtml(department);
		if (args.length > 1) {
			URI target = URI.createURI(args[1]);
			try (PrintStream ps = new PrintStream(department.eResource().getResourceSet().getURIConverter().createOutputStream(target))) {
				ps.print(html);
			}
		} else {
			URI target = URI.createURI("file:///Users/henriklarsen/eclipse-workspace/Assignment3/TDT4250.assignment.html/src/IDI.html");
			try (PrintStream ps = new PrintStream(department.eResource().getResourceSet().getURIConverter().createOutputStream(target))) {
				ps.print(html);
			}
		}
		System.out.println(html);
		
	}

	public static Department getDepartment(String uriString) throws IOException {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(ProgramPackage.eNS_URI, ProgramPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("program", new ProgramResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(uriString), true);
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof Department) {
				return (Department) eObject;
			}
		}
		return null;
	}

	public static Department getSampleDepartment() {
		try {
			return getDepartment(Program2XhtmlGeneratorMain.class.getResource("SampleProgram2.program").toString());
		} catch (IOException e) {
			System.err.println(e);
			return null;
		}
	}
}
