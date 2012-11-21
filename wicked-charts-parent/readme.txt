Making a release from eclipse
-----------------------------

1. Update POM Versions via eclipse launch configuration eclipse/update_versions.launch 
2. Run Maven build via eclipse launch configuration eclipse/release.launch
3. Change mime-type of apidocs, so they can be directly accessed from svn
	- right click on apidocs folder -> Team -> Set Property svn:mime-type to "text/html" (recursively)
	- right click on the single css file  -> Team -> Show Properties -> change svn:mime-type to "text/css"
4. Check everything in and make a tag

x. Update POM Versions to new SNAPSHOPT version via eclipse launch configuration eclipse/update_versions.launch 