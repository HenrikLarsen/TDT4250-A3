import Program.Department;
import Program.Program;
import Program.ProgramPackage;
import Program.Semester;
import Program.SemesterCourse;
import Program.Specialization;
import Program.util.ProgramResourceFactoryImpl;
import com.google.common.collect.Iterables;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.w3c.xhtml1.BodyType;
import org.w3c.xhtml1.DivType;
import org.w3c.xhtml1.H2Type;
import org.w3c.xhtml1.H3Type;
import org.w3c.xhtml1.H4Type;
import org.w3c.xhtml1.HeadType;
import org.w3c.xhtml1.HrType;
import org.w3c.xhtml1.HtmlType;
import org.w3c.xhtml1.MetaType;
import org.w3c.xhtml1.PType;
import org.w3c.xhtml1.StyleType;
import org.w3c.xhtml1.TableType;
import org.w3c.xhtml1.TdType;
import org.w3c.xhtml1.ThType;
import org.w3c.xhtml1.TitleType;
import org.w3c.xhtml1.TrType;
import org.w3c.xhtml1.Xhtml1Factory;
import org.w3c.xhtml1.util.Xhtml1ResourceFactoryImpl;

@SuppressWarnings("all")
public class Program2XhtmlGenerator {
  private Xhtml1ResourceFactoryImpl xhtml1ResourceFactoryImpl = new Xhtml1ResourceFactoryImpl();
  
  public String generateHtml(final Department department) {
    try {
      String _xblockexpression = null;
      {
        final String encoding = "UTF-8";
        final HtmlType html = this.generateHtmlType(department);
        String _xifexpression = null;
        String _name = department.getName();
        boolean _tripleNotEquals = (_name != null);
        if (_tripleNotEquals) {
          _xifexpression = department.getName().replace(".", "/");
        } else {
          _xifexpression = "department";
        }
        final String fileName = (_xifexpression + ".html");
        Resource _createResource = this.xhtml1ResourceFactoryImpl.createResource(URI.createFileURI(fileName));
        final XMLResource resource = ((XMLResource) _createResource);
        resource.getDefaultSaveOptions().put(XMLResource.OPTION_ENCODING, encoding);
        EList<EObject> _contents = resource.getContents();
        _contents.add(html);
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream(4096);
        resource.save(outputStream, null);
        final String originalOutput = outputStream.toString(encoding);
        _xblockexpression = this.cleanHtml(originalOutput);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String cleanHtml(final String html) {
    return html.replace("xhtml:", "").replace("html_._type", "html").replace("xmlns:xhtml=", "xmlns=").replace("&lt;", "<").replace("&gt;", ">").replace("&amp;", "&").replace("&quot;", "\'");
  }
  
  @Extension
  private Xhtml1Factory xhtml1Factory = Xhtml1Factory.eINSTANCE;
  
  @Extension
  private XhtmlUtil xhtmlUtil = new XhtmlUtil();
  
  public HtmlType generateHtmlType(final Department department) {
    HtmlType _xblockexpression = null;
    {
      HtmlType _createHtmlType = this.xhtml1Factory.createHtmlType();
      final Procedure1<HtmlType> _function = (HtmlType it) -> {
        HeadType _createHeadType = this.xhtml1Factory.createHeadType();
        final Procedure1<HeadType> _function_1 = (HeadType it_1) -> {
          TitleType _createTitleType = this.xhtml1Factory.createTitleType();
          final Procedure1<TitleType> _function_2 = (TitleType it_2) -> {
            String _name = department.getName();
            this.xhtmlUtil.operator_add(it_2, _name);
          };
          TitleType _doubleArrow = ObjectExtensions.<TitleType>operator_doubleArrow(_createTitleType, _function_2);
          it_1.setTitle(_doubleArrow);
          EList<MetaType> _meta = it_1.getMeta();
          MetaType _createMetaType = this.xhtml1Factory.createMetaType();
          final Procedure1<MetaType> _function_3 = (MetaType it_2) -> {
            it_2.setHttpEquiv("content-type");
            it_2.setContent("text/html; charset=UTF-8");
          };
          MetaType _doubleArrow_1 = ObjectExtensions.<MetaType>operator_doubleArrow(_createMetaType, _function_3);
          _meta.add(_doubleArrow_1);
          EList<StyleType> _style = it_1.getStyle();
          StyleType _createStyleType = this.xhtml1Factory.createStyleType();
          final Procedure1<StyleType> _function_4 = (StyleType it_2) -> {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("table, th, td {");
            _builder.newLine();
            _builder.append("  ");
            _builder.append("border: 1px solid black;");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
            this.xhtmlUtil.operator_add(it_2, _builder);
          };
          StyleType _doubleArrow_2 = ObjectExtensions.<StyleType>operator_doubleArrow(_createStyleType, _function_4);
          _style.add(_doubleArrow_2);
        };
        HeadType _doubleArrow = ObjectExtensions.<HeadType>operator_doubleArrow(_createHeadType, _function_1);
        it.setHead(_doubleArrow);
        BodyType _createBodyType = this.xhtml1Factory.createBodyType();
        final Procedure1<BodyType> _function_2 = (BodyType it_1) -> {
          EList<Program> _programs = department.getPrograms();
          for (final Program program : _programs) {
            Iterable<? extends EObject> _generate = this.generate(program);
            this.xhtmlUtil.operator_add(it_1, _generate);
          }
        };
        BodyType _doubleArrow_1 = ObjectExtensions.<BodyType>operator_doubleArrow(_createBodyType, _function_2);
        it.setBody(_doubleArrow_1);
      };
      final HtmlType html = ObjectExtensions.<HtmlType>operator_doubleArrow(_createHtmlType, _function);
      _xblockexpression = html;
    }
    return _xblockexpression;
  }
  
  protected Iterable<? extends EObject> _generate(final Program program) {
    DivType _createDivType = this.xhtml1Factory.createDivType();
    final Procedure1<DivType> _function = (DivType it) -> {
      it.setId(program.getName());
      HrType _createHrType = this.xhtml1Factory.createHrType();
      H2Type _createH2Type = this.xhtml1Factory.createH2Type();
      final Procedure1<H2Type> _function_1 = (H2Type it_1) -> {
        String _name = program.getName();
        String _plus = (_name + " ");
        float _year = program.getYear();
        String _plus_1 = (_plus + Float.valueOf(_year));
        String _plus_2 = (_plus_1 + " year");
        this.xhtmlUtil.operator_add(it_1, _plus_2);
      };
      H2Type _doubleArrow = ObjectExtensions.<H2Type>operator_doubleArrow(_createH2Type, _function_1);
      this.xhtmlUtil.operator_add(it, Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(_createHrType, _doubleArrow)));
      EList<Specialization> _specializations = program.getSpecializations();
      for (final Specialization spec : _specializations) {
        Iterable<? extends EObject> _generate = this.generate(spec);
        this.xhtmlUtil.operator_add(it, _generate);
      }
    };
    DivType _doubleArrow = ObjectExtensions.<DivType>operator_doubleArrow(_createDivType, _function);
    return Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(_doubleArrow));
  }
  
  /**
   * def dispatch Iterable<? extends EObject> generate(Specialization spec) {
   * #[
   * createHrType,
   * createH3Type => [ it += spec.name ],
   * createDivType => [
   * id = spec.name
   * for (semester : spec.semesters) {
   * it += generate(semester)
   * }
   * ]
   * ]
   * }
   */
  protected Iterable<? extends EObject> _generate(final Specialization spec) {
    HrType _createHrType = this.xhtml1Factory.createHrType();
    H3Type _createH3Type = this.xhtml1Factory.createH3Type();
    final Procedure1<H3Type> _function = (H3Type it) -> {
      String _name = spec.getName();
      this.xhtmlUtil.operator_add(it, _name);
    };
    H3Type _doubleArrow = ObjectExtensions.<H3Type>operator_doubleArrow(_createH3Type, _function);
    DivType _createDivType = this.xhtml1Factory.createDivType();
    final Procedure1<DivType> _function_1 = (DivType it) -> {
      it.setId(spec.getName());
      EList<Semester> _semesters = spec.getSemesters();
      for (final Semester semester : _semesters) {
        Iterable<? extends EObject> _generate = this.generate(semester);
        this.xhtmlUtil.operator_add(it, _generate);
      }
    };
    DivType _doubleArrow_1 = ObjectExtensions.<DivType>operator_doubleArrow(_createDivType, _function_1);
    return Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(_createHrType, _doubleArrow, _doubleArrow_1));
  }
  
  protected Iterable<? extends EObject> _generate(final Semester semester) {
    HrType _createHrType = this.xhtml1Factory.createHrType();
    H4Type _createH4Type = this.xhtml1Factory.createH4Type();
    final Procedure1<H4Type> _function = (H4Type it) -> {
      String _name = semester.getName();
      String _plus = (_name + " ");
      String _string = semester.getStatus().toString();
      String _plus_1 = (_plus + _string);
      this.xhtmlUtil.operator_add(it, _plus_1);
    };
    H4Type _doubleArrow = ObjectExtensions.<H4Type>operator_doubleArrow(_createH4Type, _function);
    TableType _createTableType = this.xhtml1Factory.createTableType();
    final Procedure1<TableType> _function_1 = (TableType it) -> {
      EList<TrType> _tr = it.getTr();
      TrType _createTrType = this.xhtml1Factory.createTrType();
      final Procedure1<TrType> _function_2 = (TrType it_1) -> {
        ThType _createThType = this.xhtml1Factory.createThType();
        final Procedure1<ThType> _function_3 = (ThType it_2) -> {
          this.xhtmlUtil.operator_add(it_2, "Code");
        };
        ThType _doubleArrow_1 = ObjectExtensions.<ThType>operator_doubleArrow(_createThType, _function_3);
        ThType _createThType_1 = this.xhtml1Factory.createThType();
        final Procedure1<ThType> _function_4 = (ThType it_2) -> {
          this.xhtmlUtil.operator_add(it_2, "Name");
        };
        ThType _doubleArrow_2 = ObjectExtensions.<ThType>operator_doubleArrow(_createThType_1, _function_4);
        ThType _createThType_2 = this.xhtml1Factory.createThType();
        final Procedure1<ThType> _function_5 = (ThType it_2) -> {
          this.xhtmlUtil.operator_add(it_2, "Credit");
        };
        ThType _doubleArrow_3 = ObjectExtensions.<ThType>operator_doubleArrow(_createThType_2, _function_5);
        ThType _createThType_3 = this.xhtml1Factory.createThType();
        final Procedure1<ThType> _function_6 = (ThType it_2) -> {
          this.xhtmlUtil.operator_add(it_2, "Status");
        };
        ThType _doubleArrow_4 = ObjectExtensions.<ThType>operator_doubleArrow(_createThType_3, _function_6);
        this.xhtmlUtil.operator_add(it_1, Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(_doubleArrow_1, _doubleArrow_2, _doubleArrow_3, _doubleArrow_4)));
      };
      TrType _doubleArrow_1 = ObjectExtensions.<TrType>operator_doubleArrow(_createTrType, _function_2);
      Iterables.<TrType>addAll(_tr, Collections.<TrType>unmodifiableList(CollectionLiterals.<TrType>newArrayList(_doubleArrow_1)));
      EList<SemesterCourse> _semesterCourses = semester.getSemesterCourses();
      for (final SemesterCourse course : _semesterCourses) {
        EList<TrType> _tr_1 = it.getTr();
        Iterable<? extends TrType> _generateTablecontent = this.generateTablecontent(course);
        Iterables.<TrType>addAll(_tr_1, _generateTablecontent);
      }
    };
    TableType _doubleArrow_1 = ObjectExtensions.<TableType>operator_doubleArrow(_createTableType, _function_1);
    return Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(_createHrType, _doubleArrow, _doubleArrow_1));
  }
  
  protected Iterable<? extends TrType> _generateTablecontent(final SemesterCourse sc) {
    TrType _createTrType = this.xhtml1Factory.createTrType();
    final Procedure1<TrType> _function = (TrType it) -> {
      TdType _createTdType = this.xhtml1Factory.createTdType();
      final Procedure1<TdType> _function_1 = (TdType it_1) -> {
        String _code = sc.getCourse().getCode();
        this.xhtmlUtil.operator_add(it_1, _code);
      };
      TdType _doubleArrow = ObjectExtensions.<TdType>operator_doubleArrow(_createTdType, _function_1);
      TdType _createTdType_1 = this.xhtml1Factory.createTdType();
      final Procedure1<TdType> _function_2 = (TdType it_1) -> {
        String _name = sc.getCourse().getName();
        this.xhtmlUtil.operator_add(it_1, _name);
      };
      TdType _doubleArrow_1 = ObjectExtensions.<TdType>operator_doubleArrow(_createTdType_1, _function_2);
      TdType _createTdType_2 = this.xhtml1Factory.createTdType();
      final Procedure1<TdType> _function_3 = (TdType it_1) -> {
        String _string = Float.valueOf(sc.getCourse().getCredit()).toString();
        this.xhtmlUtil.operator_add(it_1, _string);
      };
      TdType _doubleArrow_2 = ObjectExtensions.<TdType>operator_doubleArrow(_createTdType_2, _function_3);
      TdType _createTdType_3 = this.xhtml1Factory.createTdType();
      final Procedure1<TdType> _function_4 = (TdType it_1) -> {
        String _string = sc.getStatus().toString();
        this.xhtmlUtil.operator_add(it_1, _string);
      };
      TdType _doubleArrow_3 = ObjectExtensions.<TdType>operator_doubleArrow(_createTdType_3, _function_4);
      this.xhtmlUtil.operator_add(it, Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(_doubleArrow, _doubleArrow_1, _doubleArrow_2, _doubleArrow_3)));
    };
    TrType _doubleArrow = ObjectExtensions.<TrType>operator_doubleArrow(_createTrType, _function);
    return Collections.<TrType>unmodifiableList(CollectionLiterals.<TrType>newArrayList(_doubleArrow));
  }
  
  protected Iterable<? extends EObject> _generate(final SemesterCourse sc) {
    HrType _createHrType = this.xhtml1Factory.createHrType();
    DivType _createDivType = this.xhtml1Factory.createDivType();
    final Procedure1<DivType> _function = (DivType it) -> {
      it.setId(sc.getCourse().getCode());
      PType _createPType = this.xhtml1Factory.createPType();
      final Procedure1<PType> _function_1 = (PType it_1) -> {
        String _code = sc.getCourse().getCode();
        String _plus = ("Code: " + _code);
        this.xhtmlUtil.operator_add(it_1, _plus);
      };
      PType _doubleArrow = ObjectExtensions.<PType>operator_doubleArrow(_createPType, _function_1);
      PType _createPType_1 = this.xhtml1Factory.createPType();
      final Procedure1<PType> _function_2 = (PType it_1) -> {
        String _name = sc.getCourse().getName();
        String _plus = ("Name: " + _name);
        this.xhtmlUtil.operator_add(it_1, _plus);
      };
      PType _doubleArrow_1 = ObjectExtensions.<PType>operator_doubleArrow(_createPType_1, _function_2);
      PType _createPType_2 = this.xhtml1Factory.createPType();
      final Procedure1<PType> _function_3 = (PType it_1) -> {
        float _credit = sc.getCourse().getCredit();
        String _plus = ("Credit: " + Float.valueOf(_credit));
        this.xhtmlUtil.operator_add(it_1, _plus);
      };
      PType _doubleArrow_2 = ObjectExtensions.<PType>operator_doubleArrow(_createPType_2, _function_3);
      this.xhtmlUtil.operator_add(it, Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(_doubleArrow, _doubleArrow_1, _doubleArrow_2)));
    };
    DivType _doubleArrow = ObjectExtensions.<DivType>operator_doubleArrow(_createDivType, _function);
    return Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(_createHrType, _doubleArrow));
  }
  
  public static void main(final String[] args) throws IOException {
    final List<String> argsAsList = Arrays.<String>asList(args);
    Department _xifexpression = null;
    int _size = argsAsList.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      _xifexpression = Program2XhtmlGenerator.getDepartment(argsAsList.get(0));
    } else {
      _xifexpression = Program2XhtmlGenerator.getSampleDepartment();
    }
    final Department department = _xifexpression;
    final String html = new Program2XhtmlGenerator().generateHtml(department);
    int _length = args.length;
    boolean _greaterThan_1 = (_length > 1);
    if (_greaterThan_1) {
      final URI target = URI.createURI(argsAsList.get(1));
      OutputStream _createOutputStream = department.eResource().getResourceSet().getURIConverter().createOutputStream(target);
      final PrintStream ps = new PrintStream(_createOutputStream);
      ps.print(html);
    } else {
      System.out.println(html);
    }
  }
  
  public static Department getDepartment(final String uriString) throws IOException {
    final ResourceSetImpl resSet = new ResourceSetImpl();
    resSet.getPackageRegistry().put(ProgramPackage.eNS_URI, ProgramPackage.eINSTANCE);
    Map<String, Object> _extensionToFactoryMap = resSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
    ProgramResourceFactoryImpl _programResourceFactoryImpl = new ProgramResourceFactoryImpl();
    _extensionToFactoryMap.put("program", _programResourceFactoryImpl);
    final Resource resource = resSet.getResource(URI.createURI(uriString), true);
    EList<EObject> _contents = resource.getContents();
    for (final EObject eObject : _contents) {
      if ((eObject instanceof Department)) {
        return ((Department) eObject);
      }
    }
    return null;
  }
  
  public static Department getSampleDepartment() {
    try {
      return Program2XhtmlGenerator.getDepartment(Program2XhtmlGeneratorMain.class.getResource("SampleProgram3.program").toString());
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        System.err.println(e);
        return null;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public Iterable<? extends EObject> generate(final EObject program) {
    if (program instanceof Program) {
      return _generate((Program)program);
    } else if (program instanceof Semester) {
      return _generate((Semester)program);
    } else if (program instanceof SemesterCourse) {
      return _generate((SemesterCourse)program);
    } else if (program instanceof Specialization) {
      return _generate((Specialization)program);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(program).toString());
    }
  }
  
  public Iterable<? extends TrType> generateTablecontent(final SemesterCourse sc) {
    return _generateTablecontent(sc);
  }
}
