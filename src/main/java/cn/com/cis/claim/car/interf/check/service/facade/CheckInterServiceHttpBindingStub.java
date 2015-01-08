/**
 * CheckInterServiceHttpBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.service.facade;

public class CheckInterServiceHttpBindingStub extends org.apache.axis.client.Stub implements cn.com.cis.claim.car.interf.check.service.facade.CheckInterServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addDoc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DocInfo"), cn.com.cis.claim.car.interf.check.vo.DocInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ResultInfo"));
        oper.setReturnClass(cn.com.cis.claim.car.interf.check.vo.ResultInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "User"), cn.com.cis.claim.car.interf.check.vo.User.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CheckUserReturnInfo"));
        oper.setReturnClass(cn.com.cis.claim.car.interf.check.vo.CheckUserReturnInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addDeflossInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DeflossCarInfo"), cn.com.cis.claim.car.interf.check.vo.DeflossCarInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "AddDeflossReturnInfo"));
        oper.setReturnClass(cn.com.cis.claim.car.interf.check.vo.AddDeflossReturnInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isDeflossUndwrt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DeflossUndwrt"), cn.com.cis.claim.car.interf.check.vo.DeflossUndwrt.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ResultInfo"));
        oper.setReturnClass(cn.com.cis.claim.car.interf.check.vo.ResultInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addCheckInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CheckInfo"), cn.com.cis.claim.car.interf.check.vo.CheckInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ResultInfo"));
        oper.setReturnClass(cn.com.cis.claim.car.interf.check.vo.ResultInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("initDeflossInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "TaskInfo"), cn.com.cis.claim.car.interf.check.vo.TaskInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DeflossReturnInfo"));
        oper.setReturnClass(cn.com.cis.claim.car.interf.check.vo.DeflossReturnInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFactoryInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "FactoryReturnInfo"));
        oper.setReturnClass(cn.com.cis.claim.car.interf.check.vo.FactoryReturnInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addDeflossConfirm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DeflossConfirm"), cn.com.cis.claim.car.interf.check.vo.DeflossConfirm.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ResultInfo"));
        oper.setReturnClass(cn.com.cis.claim.car.interf.check.vo.ResultInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTaskList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "TaskListInfo"), cn.com.cis.claim.car.interf.check.vo.TaskListInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "TaskRetrunInfo"));
        oper.setReturnClass(cn.com.cis.claim.car.interf.check.vo.TaskRetrunInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("initCheckInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "TaskInfo"), cn.com.cis.claim.car.interf.check.vo.TaskInfo.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CheckReturnInfo"));
        oper.setReturnClass(cn.com.cis.claim.car.interf.check.vo.CheckReturnInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    public CheckInterServiceHttpBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CheckInterServiceHttpBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CheckInterServiceHttpBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "AddDeflossReturnInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.AddDeflossReturnInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ArrayOfCarInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.CarInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CarInfo");
            qName2 = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CarInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ArrayOfComponent");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.Component[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Component");
            qName2 = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Component");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ArrayOfEndorseInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.EndorseInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "EndorseInfo");
            qName2 = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "EndorseInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ArrayOfEngageInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.EngageInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "EngageInfo");
            qName2 = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "EngageInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ArrayOfFactory");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.Factory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Factory");
            qName2 = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Factory");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ArrayOfFileInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.FileInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "FileInfo");
            qName2 = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "FileInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ArrayOfInsuranceItem");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.InsuranceItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "InsuranceItem");
            qName2 = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "InsuranceItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ArrayOfItemInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.ItemInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ItemInfo");
            qName2 = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ItemInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ArrayOfKindInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.KindInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "KindInfo");
            qName2 = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "KindInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ArrayOfMaterial");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.Material[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Material");
            qName2 = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Material");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ArrayOfOtherFee");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.OtherFee[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "OtherFee");
            qName2 = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "OtherFee");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ArrayOfPolicyInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.PolicyInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "PolicyInfo");
            qName2 = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "PolicyInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ArrayOfRepair");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.Repair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Repair");
            qName2 = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Repair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ArrayOfTaskReturn");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.TaskReturn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "TaskReturn");
            qName2 = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "TaskReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CarInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.CarInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CaseInfoMobile");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.CaseInfoMobile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CheckInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.CheckInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CheckReturnInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.CheckReturnInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CheckTaskInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.CheckTaskInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "CheckUserReturnInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.CheckUserReturnInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Component");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.Component.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DeflossCarInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.DeflossCarInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DeflossConfirm");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.DeflossConfirm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DeflossReturnInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.DeflossReturnInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DeflossUndwrt");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.DeflossUndwrt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "DocInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.DocInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "EndorseInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.EndorseInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "EngageInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.EngageInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "EvalRequest");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.EvalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Factory");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.Factory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "FactoryReturnInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.FactoryReturnInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "FileInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.FileInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "InsuranceItem");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.InsuranceItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ItemInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.ItemInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "KindInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.KindInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Material");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.Material.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "OtherFee");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.OtherFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "PolicyInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.PolicyInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "Repair");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.Repair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "ResultInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.ResultInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "TaskInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.TaskInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "TaskListInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.TaskListInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "TaskRetrunInfo");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.TaskRetrunInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "TaskReturn");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.TaskReturn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.check.interf.car.claim.cis.com.cn", "User");
            cachedSerQNames.add(qName);
            cls = cn.com.cis.claim.car.interf.check.vo.User.class;
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

    public cn.com.cis.claim.car.interf.check.vo.ResultInfo addDoc(cn.com.cis.claim.car.interf.check.vo.DocInfo in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "addDoc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.cis.claim.car.interf.check.vo.ResultInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.cis.claim.car.interf.check.vo.ResultInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.cis.claim.car.interf.check.vo.ResultInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.cis.claim.car.interf.check.vo.CheckUserReturnInfo checkUser(cn.com.cis.claim.car.interf.check.vo.User in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "checkUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.cis.claim.car.interf.check.vo.CheckUserReturnInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.cis.claim.car.interf.check.vo.CheckUserReturnInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.cis.claim.car.interf.check.vo.CheckUserReturnInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.cis.claim.car.interf.check.vo.AddDeflossReturnInfo addDeflossInfo(cn.com.cis.claim.car.interf.check.vo.DeflossCarInfo in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "addDeflossInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.cis.claim.car.interf.check.vo.AddDeflossReturnInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.cis.claim.car.interf.check.vo.AddDeflossReturnInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.cis.claim.car.interf.check.vo.AddDeflossReturnInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.cis.claim.car.interf.check.vo.ResultInfo isDeflossUndwrt(cn.com.cis.claim.car.interf.check.vo.DeflossUndwrt in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "isDeflossUndwrt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.cis.claim.car.interf.check.vo.ResultInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.cis.claim.car.interf.check.vo.ResultInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.cis.claim.car.interf.check.vo.ResultInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.cis.claim.car.interf.check.vo.ResultInfo addCheckInfo(cn.com.cis.claim.car.interf.check.vo.CheckInfo in0) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "addCheckInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.cis.claim.car.interf.check.vo.ResultInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.cis.claim.car.interf.check.vo.ResultInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.cis.claim.car.interf.check.vo.ResultInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.cis.claim.car.interf.check.vo.DeflossReturnInfo initDeflossInfo(cn.com.cis.claim.car.interf.check.vo.TaskInfo in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "initDeflossInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.cis.claim.car.interf.check.vo.DeflossReturnInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.cis.claim.car.interf.check.vo.DeflossReturnInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.cis.claim.car.interf.check.vo.DeflossReturnInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.cis.claim.car.interf.check.vo.FactoryReturnInfo getFactoryInfo(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "getFactoryInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.cis.claim.car.interf.check.vo.FactoryReturnInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.cis.claim.car.interf.check.vo.FactoryReturnInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.cis.claim.car.interf.check.vo.FactoryReturnInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.cis.claim.car.interf.check.vo.ResultInfo addDeflossConfirm(cn.com.cis.claim.car.interf.check.vo.DeflossConfirm in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "addDeflossConfirm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.cis.claim.car.interf.check.vo.ResultInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.cis.claim.car.interf.check.vo.ResultInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.cis.claim.car.interf.check.vo.ResultInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.cis.claim.car.interf.check.vo.TaskRetrunInfo getTaskList(cn.com.cis.claim.car.interf.check.vo.TaskListInfo in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "getTaskList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.cis.claim.car.interf.check.vo.TaskRetrunInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.cis.claim.car.interf.check.vo.TaskRetrunInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.cis.claim.car.interf.check.vo.TaskRetrunInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cn.com.cis.claim.car.interf.check.vo.CheckReturnInfo initCheckInfo(cn.com.cis.claim.car.interf.check.vo.TaskInfo in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "initCheckInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.com.cis.claim.car.interf.check.vo.CheckReturnInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.com.cis.claim.car.interf.check.vo.CheckReturnInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.com.cis.claim.car.interf.check.vo.CheckReturnInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
