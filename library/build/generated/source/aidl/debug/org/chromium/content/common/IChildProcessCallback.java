/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\thuan\\Documents\\ChromeApplication\\library\\src\\main\\aidl\\org\\chromium\\content\\common\\IChildProcessCallback.aidl
 */
package org.chromium.content.common;
public interface IChildProcessCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.chromium.content.common.IChildProcessCallback
{
private static final java.lang.String DESCRIPTOR = "org.chromium.content.common.IChildProcessCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.chromium.content.common.IChildProcessCallback interface,
 * generating a proxy if needed.
 */
public static org.chromium.content.common.IChildProcessCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.chromium.content.common.IChildProcessCallback))) {
return ((org.chromium.content.common.IChildProcessCallback)iin);
}
return new org.chromium.content.common.IChildProcessCallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_establishSurfacePeer:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.view.Surface _arg1;
if ((0!=data.readInt())) {
_arg1 = android.view.Surface.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.establishSurfacePeer(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_getViewSurface:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.view.Surface _result = this.getViewSurface(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.chromium.content.common.IChildProcessCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
// Conduit to pass a Surface from the sandboxed renderer to the plugin.

@Override public void establishSurfacePeer(int pid, android.view.Surface surface, int primaryID, int secondaryID) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(pid);
if ((surface!=null)) {
_data.writeInt(1);
surface.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(primaryID);
_data.writeInt(secondaryID);
mRemote.transact(Stub.TRANSACTION_establishSurfacePeer, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.view.Surface getViewSurface(int surfaceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.view.Surface _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(surfaceId);
mRemote.transact(Stub.TRANSACTION_getViewSurface, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.view.Surface.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_establishSurfacePeer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getViewSurface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
// Conduit to pass a Surface from the sandboxed renderer to the plugin.

public void establishSurfacePeer(int pid, android.view.Surface surface, int primaryID, int secondaryID) throws android.os.RemoteException;
public android.view.Surface getViewSurface(int surfaceId) throws android.os.RemoteException;
}
