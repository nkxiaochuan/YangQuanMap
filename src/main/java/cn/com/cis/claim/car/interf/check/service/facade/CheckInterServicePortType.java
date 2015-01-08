/**
 * CheckInterServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.service.facade;

public interface CheckInterServicePortType extends java.rmi.Remote {
    public cn.com.cis.claim.car.interf.check.vo.ResultInfo addDoc(cn.com.cis.claim.car.interf.check.vo.DocInfo in0) throws java.rmi.RemoteException;
    public cn.com.cis.claim.car.interf.check.vo.CheckUserReturnInfo checkUser(cn.com.cis.claim.car.interf.check.vo.User in0) throws java.rmi.RemoteException;
    public cn.com.cis.claim.car.interf.check.vo.AddDeflossReturnInfo addDeflossInfo(cn.com.cis.claim.car.interf.check.vo.DeflossCarInfo in0) throws java.rmi.RemoteException;
    public cn.com.cis.claim.car.interf.check.vo.ResultInfo isDeflossUndwrt(cn.com.cis.claim.car.interf.check.vo.DeflossUndwrt in0) throws java.rmi.RemoteException;
    public cn.com.cis.claim.car.interf.check.vo.ResultInfo addCheckInfo(cn.com.cis.claim.car.interf.check.vo.CheckInfo in0) throws java.rmi.RemoteException;
    public cn.com.cis.claim.car.interf.check.vo.DeflossReturnInfo initDeflossInfo(cn.com.cis.claim.car.interf.check.vo.TaskInfo in0) throws java.rmi.RemoteException;
    public cn.com.cis.claim.car.interf.check.vo.FactoryReturnInfo getFactoryInfo(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException;
    public cn.com.cis.claim.car.interf.check.vo.ResultInfo addDeflossConfirm(cn.com.cis.claim.car.interf.check.vo.DeflossConfirm in0) throws java.rmi.RemoteException;
    public cn.com.cis.claim.car.interf.check.vo.TaskRetrunInfo getTaskList(cn.com.cis.claim.car.interf.check.vo.TaskListInfo in0) throws java.rmi.RemoteException;
    public cn.com.cis.claim.car.interf.check.vo.CheckReturnInfo initCheckInfo(cn.com.cis.claim.car.interf.check.vo.TaskInfo in0) throws java.rmi.RemoteException;
}
