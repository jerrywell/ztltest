/* B35_2349456Test.scala

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Feb 17, 2012 12:00:00 PM , Created by Fernando Selvatici
}}IS_NOTE

Copyright (C) 2011 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package org.zkoss.zktest.test2.B35

import org.zkoss.zstl.ZTL4ScalaTestCase
import org.zkoss.ztl.Tags
import org.zkoss.ztl.Widget
import org.zkoss.ztl.Element
import org.zkoss.ztl.ZK
import org.zkoss.ztl.util.Scripts
import org.openqa.selenium.Keys
import org.junit.Test

/**
 * @author Fernando Selvatici
 *
 */
@Tags(tags = "B35-2349456.zul,B,E,Window,Button")
class B35_2349456Test extends ZTL4ScalaTestCase {
  @Test
  def testClick() = {
    val zscript = {
      <window title="Live Data" border="normal">
        <zscript><![CDATA[
String[] data = new String[30];
for(int j=0; j < data.length; ++j) {
data[ j ] = "option "+j;
}
ListModel strset = new SimpleListModel(data);
]]></zscript>
        After this page display, you should be able to navigate the listbox via pressing the DOWN/UP button.
        <listbox id="list" width="200px" rows="10" model="${strset}">
          <listhead>
            <listheader label="Load on Demend" sort="auto"/>
          </listhead>
          <zscript>
            list.setSelectedItem(list.getItemAtIndex(0));
list.focus();
          </zscript>
        </listbox>
      </window>
    }
    runZTL(zscript, () => {
      var listWidget =
        engine.$f("list");
      var listElement  =
        listWidget.$n("real");
      val a = listWidget.$n("a")

      // Click on first element of the list to verify later the final selected item
      click(jq(".z-listcell:contains(option 0)"));

      focus(a);

      // The following three commands doesn't work (Chrome/Firefox). The selected does not change.
//      sendKeys(listWidget, Keys.ARROW_DOWN);
//      keyPress(listWidget, "\\28");
      sendKeys(a, Keys.DOWN);
      waitResponse();

      // Press the DOWN key
      sendKeys(a, Keys.DOWN);

      // Press the DOWN key
      sendKeys(a, Keys.DOWN);

      // Press the DOWN key
      sendKeys(a, Keys.DOWN);

      // Press the UP key
      sendKeys(a, Keys.UP);

      // Press the UP key
      sendKeys(a, Keys.UP);
      
      // After DOWN+DOWN+DOWN+UP+UP the selected item should be "Option 2"
      if(!ZK.is("opera"))
    	  verifyTrue("The selected item should be 'option 2'", jq(".z-listitem-selected").text().contains("option 2"));
      else
    	  verifyTrue("The selected item should be 'option 1'", jq(".z-listitem-selected").text().contains("option 1"));

    })
  }
}