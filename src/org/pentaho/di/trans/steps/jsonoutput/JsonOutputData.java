 /* Copyright (c) 2007 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the GNU Lesser General Public License, Version 2.1. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.gnu.org/licenses/lgpl-2.1.txt. The Original Code is Pentaho 
 * Data Integration.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the GNU Lesser Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.*/
 

package org.pentaho.di.trans.steps.jsonoutput;

import java.io.Writer;
import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.trans.step.BaseStepData;
import org.pentaho.di.trans.step.StepDataInterface;

/**
 * @author Matt
 * @since 22-jan-2005
 */
public class JsonOutputData extends BaseStepData implements StepDataInterface
{
	public ObjectMapper mapper = new ObjectMapper();
	
	public RowMetaInterface inputRowMeta;
	public RowMetaInterface outputRowMeta;
	public int inputRowMetaSize;
	
	public int nrFields;

	public int[] fieldIndexes;
//	public ObjectNode jg;
	public ArrayNode jsonArray;
    public int nrRow;
    public boolean rowsAreSafe;
    public NumberFormat nf;
    public DecimalFormat df;
    public DecimalFormatSymbols dfs;
    
    public SimpleDateFormat daf;
    public DateFormatSymbols dafs;

    public DecimalFormat        defaultDecimalFormat;
    public DecimalFormatSymbols defaultDecimalFormatSymbols;

    public SimpleDateFormat  defaultDateFormat;
    public DateFormatSymbols defaultDateFormatSymbols;
    
    public boolean outputValue;
    public boolean writeToFile;
    
	public String realBlocName;
	public int splitnr;
    public Writer writer;
    public int nrRowsInBloc;

    /**
     * Initialize Data for {@link JsonOutput} step.
     */
    public JsonOutputData()
    {
        super();
        mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
        this.jsonArray = mapper.createArrayNode();
        this.nrRow=0;
        this.outputValue=false;
        this.writeToFile=false;
        this.writer=null;
        this.nrRowsInBloc=0;
    }

}
