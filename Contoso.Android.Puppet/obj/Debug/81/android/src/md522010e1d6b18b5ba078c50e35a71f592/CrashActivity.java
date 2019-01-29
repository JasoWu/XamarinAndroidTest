package md522010e1d6b18b5ba078c50e35a71f592;


public class CrashActivity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Contoso.Android.Puppet.CrashActivity, Contoso.Android.Puppet", CrashActivity.class, __md_methods);
	}


	public CrashActivity ()
	{
		super ();
		if (getClass () == CrashActivity.class)
			mono.android.TypeManager.Activate ("Contoso.Android.Puppet.CrashActivity, Contoso.Android.Puppet", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
