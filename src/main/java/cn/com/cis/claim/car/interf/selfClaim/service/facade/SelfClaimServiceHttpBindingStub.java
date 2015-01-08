/**
 * SelfClaimServiceHttpBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.selfClaim.service.facade;

public class SelfClaimServiceHttpBindingStub extends org.apache.axis.client.Stub implements cn.com.cis.claim.car.interf.selfClaim.service.facade.SelfClaimServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkMyUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.selfClaim.interf.car.claim.cis.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "MyUser"), cn.com.cis.claim.car.interf.selfClaim.vo.MyUser.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "CheckUserReturnInfo"));
        oper.setReturnClass(cn.com.cis.claim.car.interf.selfClaim.vo.CheckUserReturnInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://facade.service.selfClaim.interf.car.claim.cis.com.cn", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addMyDeflossConfirm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.selfClaim.interf.car.claim.cis.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "MyDeflossConfirm"), cn.com.cis.claim.car.interf.selfClaim.vo.MyDeflossConfirm.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ResultInfo"));
        oper.setReturnClass(cn.com.cis.claim.car.interf.selfClaim.vo.ResultInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://facade.service.selfClaim.interf.car.claim.cis.com.cn", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addMyCheckInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.selfClaim.interf.car.claim.cis.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "MyCheckInfo"), cn.com.cis.claim.car.interf.selfClaim.vo.MyCheckInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "MyCheckReturnInfo"));
        oper.setReturnClass(cn.com.cis.claim.car.interf.selfClaim.vo.MyCheckReturnInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://facade.service.selfClaim.interf.car.claim.cis.com.cn", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMyCaseInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.selfClaim.interf.car.claim.cis.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "RegistInfo"), cn.com.cis.claim.car.interf.selfClaim.vo.RegistInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "CaseInfo"));
        oper.setReturnClass(cn.com.cis.claim.car.interf.selfClaim.vo.CaseInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://facade.service.selfClaim.interf.car.claim.cis.com.cn", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMyPolicyInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.selfClaim.interf.car.claim.cis.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "RegistInfo"), cn.com.cis.claim.car.interf.selfClaim.vo.RegistInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "PolicyReturnInfo"));
        oper.setReturnClass(cn.com.cis.claim.car.interf.selfClaim.vo.PolicyReturnInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://facade.service.selfClaim.interf.car.claim.cis.com.cn", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public SelfClaimServiceHttpBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SelfClaimServiceHttpBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SelfClaimServiceHttpBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ArrayOfCaseBasicInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.CaseBasicInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "CaseBasicInfo");
            qName2 = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "CaseBasicInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ArrayOfComponent");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.Component[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Component");
            qName2 = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Component");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ArrayOfDeflossCarInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.DeflossCarInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "DeflossCarInfo");
            qName2 = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "DeflossCarInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ArrayOfEndorseInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.EndorseInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "EndorseInfo");
            qName2 = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "EndorseInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ArrayOfEngageInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.EngageInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "EngageInfo");
            qName2 = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "EngageInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ArrayOfFileInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.FileInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "FileInfo");
            qName2 = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "FileInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ArrayOfItemInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.ItemInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ItemInfo");
            qName2 = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ItemInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ArrayOfMaterial");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.Material[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Material");
            qName2 = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Material");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ArrayOfOthers");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.Others[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Others");
            qName2 = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Others");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ArrayOfPolicyInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.PolicyInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "PolicyInfo");
            qName2 = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "PolicyInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ArrayOfRegistInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.RegistInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "RegistInfo");
            qName2 = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "RegistInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ArrayOfRepair");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.Repair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Repair");
            qName2 = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Repair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ArrayOfUnpassFile");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.UnpassFile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "UnpassFile");
            qName2 = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "UnpassFile");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "CaseBasicInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.CaseBasicInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "CaseInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.CaseInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "CheckUserReturnInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.CheckUserReturnInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Component");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.Component.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "DeflossCarInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.DeflossCarInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "EndorseInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.EndorseInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "EngageInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.EngageInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Factory");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.Factory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "FileInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.FileInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ItemInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.ItemInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Material");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.Material.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "MyCheckInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.MyCheckInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "MyCheckReturnInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.MyCheckReturnInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "MyDeflossConfirm");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.MyDeflossConfirm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "MyUser");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.MyUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Others");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.Others.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "PolicyInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.PolicyInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "PolicyReturnInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.PolicyReturnInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "RegistInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.RegistInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "Repair");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.Repair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "ResultInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.ResultInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.selfClaim.interf.car.claim.cis.com.cn", "UnpassFile");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.selfClaim.vo.UnpassFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public cn.com.cis.claim.car.interf.selfClaim.vo.CheckUserReturnInfo checkMyUser(cn.com.cis.claim.car.interf.selfClaim.vo.MyUser in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://facade.service.selfClaim.interf.car.claim.cis.com.cn", "checkMyUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.cis.claim.car.interf.selfClaim.vo.CheckUserReturnInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.cis.claim.car.interf.selfClaim.vo.CheckUserReturnInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.cis.claim.car.interf.selfClaim.vo.CheckUserReturnInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.cis.claim.car.interf.selfClaim.vo.ResultInfo addMyDeflossConfirm(cn.com.cis.claim.car.interf.selfClaim.vo.MyDeflossConfirm in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://facade.service.selfClaim.interf.car.claim.cis.com.cn", "addMyDeflossConfirm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.cis.claim.car.interf.selfClaim.vo.ResultInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.cis.claim.car.interf.selfClaim.vo.ResultInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.cis.claim.car.interf.selfClaim.vo.ResultInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.cis.claim.car.interf.selfClaim.vo.MyCheckReturnInfo addMyCheckInfo(cn.com.cis.claim.car.interf.selfClaim.vo.MyCheckInfo in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://facade.service.selfClaim.interf.car.claim.cis.com.cn", "addMyCheckInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.cis.claim.car.interf.selfClaim.vo.MyCheckReturnInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.cis.claim.car.interf.selfClaim.vo.MyCheckReturnInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.cis.claim.car.interf.selfClaim.vo.MyCheckReturnInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.cis.claim.car.interf.selfClaim.vo.CaseInfo getMyCaseInfo(cn.com.cis.claim.car.interf.selfClaim.vo.RegistInfo in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://facade.service.selfClaim.interf.car.claim.cis.com.cn", "getMyCaseInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.cis.claim.car.interf.selfClaim.vo.CaseInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.cis.claim.car.interf.selfClaim.vo.CaseInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.cis.claim.car.interf.selfClaim.vo.CaseInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.cis.claim.car.interf.selfClaim.vo.PolicyReturnInfo getMyPolicyInfo(cn.com.cis.claim.car.interf.selfClaim.vo.RegistInfo in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://facade.service.selfClaim.interf.car.claim.cis.com.cn", "getMyPolicyInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.cis.claim.car.interf.selfClaim.vo.PolicyReturnInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.cis.claim.car.interf.selfClaim.vo.PolicyReturnInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.cis.claim.car.interf.selfClaim.vo.PolicyReturnInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
