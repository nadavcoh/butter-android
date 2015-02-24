/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class error_category {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected error_category(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(error_category obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_error_category(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String name() {
    return libtorrent_jni.error_category_name(swigCPtr, this);
  }

  public String message(int ev) {
    return libtorrent_jni.error_category_message(swigCPtr, this, ev);
  }

  public error_condition default_error_condition(int ev) {
    return new error_condition(libtorrent_jni.error_category_default_error_condition(swigCPtr, this, ev), true);
  }

  public boolean equivalent(int code, error_condition condition) {
    return libtorrent_jni.error_category_equivalent__SWIG_0(swigCPtr, this, code, error_condition.getCPtr(condition), condition);
  }

  public boolean equivalent(error_code code, int condition) {
    return libtorrent_jni.error_category_equivalent__SWIG_1(swigCPtr, this, error_code.getCPtr(code), code, condition);
  }

  public boolean op_eq(error_category rhs) {
    return libtorrent_jni.error_category_op_eq(swigCPtr, this, error_category.getCPtr(rhs), rhs);
  }

  public boolean op_neq(error_category rhs) {
    return libtorrent_jni.error_category_op_neq(swigCPtr, this, error_category.getCPtr(rhs), rhs);
  }

  public boolean op_lt(error_category rhs) {
    return libtorrent_jni.error_category_op_lt(swigCPtr, this, error_category.getCPtr(rhs), rhs);
  }

}
