/**
 * Returns the value of a parameter in Wicket's extra parameter map (ep).
 * The ep map has the following structure:
 * <p/>
 * [{'name':'...', 'value':'...'},...]
 * 
 */
function getWicketExtraParameter(ep, paramName){
	for(i=0; i< ep.length; i++){
		if(ep[i]['name'] == paramName){
			return ep[i]['value'];
		}
	}
}