/* B35_2089073Test.scala

	Purpose:
		
	Description:
		
	History:
		Tue Dec 13 11:59:58 TST 2011, Created by jumperchen

Copyright (C) 2011 Potix Corporation. All Rights Reserved.

This program is distributed under LGPL Version 3.0 in the hope that
it will be useful, but WITHOUT ANY WARRANTY.
*/
package org.zkoss.zktest.test2.B35

import org.zkoss.zstl.ZTL4ScalaTestCase
import org.zkoss.ztl.Tags;

/**
 * 
 * @author jumperchen
 */
@Tags(tags = "B35-2089073.zul,A,E,Window,onMaximize,FF3,VisionTest")
class B35_2089073Test extends ZTL4ScalaTestCase {
	def testCase() = {
		val zscript = {"""
		<?page id="main" title=".:: ZK BUG 2089073 ::." style="height:100%"?>

<window id="wndLayout" width="100%" height="100%" border="normal"
	xmlns:n="http://www.zkoss.org/2005/zk/native"
	xmlns:h="http://www.w3.org/1999/xhtml"
	xmlns:zk="http://www.zkoss.org/2005/zul"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.zkoss.org/2005/zul http://www.zkoss.org/2005/zul/zul.xsd">
	
	<zk:borderlayout>
		<zk:north size="100px"><div>
			Please press the <button label="click me" onClick='openRole();'/> button, and then the maximized window should over all the screen(That is correct. FF3 only)
			</div>
		</zk:north>
		<zk:center>
			<zk:window id="center"/>
		</zk:center>
		<zk:south size="3%" flex="true">
			<h:table class="ToolbarTable">
				<h:tr>
					<h:td align="left">
						<zk:label id="lblFooter" style="font-size: 8pt;"/>
					</h:td>
					<h:td>
						<zk:space/>
					</h:td>
					<h:td align="right" width="50%">
						<zk:label id="lblUtilizadores" style="font-size: 8pt;"/>
					</h:td>
				</h:tr>
			</h:table>			
		</zk:south>
	</zk:borderlayout>
	
	<zk:zscript>
		<![CDATA[
			void openRole() {
				Window inner = new Window();
				inner.width = "320px";
				inner.title = "role";
				inner.border = "normal";
				inner.maximizable= true;
				inner.maximized= true;
				inner.setParent(center);
				inner.doOverlapped();
			}			
		]]>
	</zk:zscript>
	
</window>
		"""}
		runZTL(zscript, () => {
			click(jq("@button"))
			waitResponse()
			verifyImage()
		})
	}
}
