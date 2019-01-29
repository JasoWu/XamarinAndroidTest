package md522010e1d6b18b5ba078c50e35a71f592;


public abstract class PageFragment
	extends android.support.v4.app.Fragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_setInitialSavedState:(Landroid/support/v4/app/Fragment$SavedState;)V:GetSetInitialSavedState_Landroid_support_v4_app_Fragment_SavedState_Handler\n" +
			"n_getUserVisibleHint:()Z:GetGetUserVisibleHintHandler\n" +
			"n_setUserVisibleHint:(Z)V:GetSetUserVisibleHint_ZHandler\n" +
			"";
		mono.android.Runtime.register ("Contoso.Android.Puppet.PageFragment, Contoso.Android.Puppet", PageFragment.class, __md_methods);
	}


	public PageFragment ()
	{
		super ();
		if (getClass () == PageFragment.class)
			mono.android.TypeManager.Activate ("Contoso.Android.Puppet.PageFragment, Contoso.Android.Puppet", "", this, new java.lang.Object[] {  });
	}


	public void setInitialSavedState (android.support.v4.app.Fragment.SavedState p0)
	{
		n_setInitialSavedState (p0);
	}

	private native void n_setInitialSavedState (android.support.v4.app.Fragment.SavedState p0);


	public boolean getUserVisibleHint ()
	{
		return n_getUserVisibleHint ();
	}

	private native boolean n_getUserVisibleHint ();


	public void setUserVisibleHint (boolean p0)
	{
		n_setUserVisibleHint (p0);
	}

	private native void n_setUserVisibleHint (boolean p0);

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
