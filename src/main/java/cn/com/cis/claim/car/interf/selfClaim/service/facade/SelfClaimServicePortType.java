/**
 * SelfClaimServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.selfClaim.service.facade;

public interface SelfClaimServicePortType extends java.rmi.Remote {
    public cn.com.cis.claim.car.interf.selfClaim.vo.CheckUserReturnInfo checkMyUser(cn.com.cis.claim.car.interf.selfClaim.vo.MyUser in0) throws java.rmi.RemoteException;
    public cn.com.cis.claim.car.interf.selfClaim.vo.ResultInfo addMyDeflossConfirm(cn.com.cis.claim.car.interf.selfClaim.vo.MyDeflossConfirm in0) throws java.rmi.RemoteException;
    public cn.com.cis.claim.car.interf.selfClaim.vo.MyCheckReturnInfo addMyCheckInfo(cn.com.cis.claim.car.interf.selfClaim.vo.MyCheckInfo in0) throws java.rmi.RemoteException;
    public cn.com.cis.claim.car.interf.selfClaim.vo.CaseInfo getMyCaseInfo(cn.com.cis.claim.car.interf.selfClaim.vo.RegistInfo in0) throws java.rmi.RemoteException;
    public cn.com.cis.claim.car.interf.selfClaim.vo.PolicyReturnInfo getMyPolicyInfo(cn.com.cis.claim.car.interf.selfClaim.vo.RegistInfo in0) throws java.rmi.RemoteException;
}
