/*
 *  GeoServer-Manager - Simple Manager Library for GeoServer
 *  
 *  Copyright (C) 2007,2011 GeoSolutions S.A.S.
 *  http://www.geo-solutions.it
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package it.geosolutions.geoserver.rest.encoder;

import it.geosolutions.geoserver.rest.encoder.utils.PropertyXMLEncoder;

/**
 *
 * @author ETj (etj at geo-solutions.it)
 * @author Carlo Cancellieri - carlo.cancellieri@geo-solutions.it
 * 
 * The layer encoder is enabled by default
 * 
 */
public class GSLayerEncoder extends PropertyXMLEncoder {

    public GSLayerEncoder() {
        super("layer");
        addEnabled();
    }
    
    protected void addEnabled(){
        add("enabled","true");
    }
    
    /**
     * @param enable true if layer should be set to enabled 
     */
    public void setEnabled(boolean enable){
    	if (enable)
    		set("enabled","true");
    	else
    		set("enabled","false");
    }

    /**
     * 
     * @param defaultStyle
     * @deprecated will be set to protected in the next release, please use setDefaultStyle
     * 
     */
    public void addDefaultStyle(String defaultStyle) {
        add("defaultStyle", defaultStyle);
    }
    
    public void setDefaultStyle(String defaultStyle) {
        set("defaultStyle", defaultStyle);
    }
}
