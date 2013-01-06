Making a release from eclipse
-----------------------------

1. Update POM Versions via eclipse launch configuration eclipse/update_versions.launch 
2. Run Maven build via eclipse launch configuration eclipse/release.launch
3. Change mime-type of apidocs, so they can be directly accessed from svn
	- right click on apidocs/com folder -> Team -> Set Property svn:mime-type to "text/html" (recursively)
	- right click on the single css file  -> Team -> Show Properties -> change svn:mime-type to "text/css"
4. Check everything in and make a tag
5. Sign pom.xml, javadoc.ja, sources.jar and binary jar of the following projects
	- wicked-charts-highcharts
	- wicked-charts-wicket15
	- wicked-charts-wicket6
	- wicked-charts-jsf21
	(when signing with with gpg4win, check "detached signature" and "ascii container" plus you have to rename pom.xml.sig to pom.asc and the extensions of 
	the other signature files from .sig to .asc)
6. For each module, upload all artifacts (including *.asc and pom.asc) to sonatype nexus
	- for the pom.asc, enter "pom.asc" in the "extension" field
7. Update POM Versions to new SNAPSHOT version via eclipse launch configuration eclipse/update_versions.launch
8. Check everything in 