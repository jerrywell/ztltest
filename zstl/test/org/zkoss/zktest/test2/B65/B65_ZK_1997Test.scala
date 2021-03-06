package org.zkoss.zktest.test2.B65

import org.zkoss.ztl.Tags
import org.zkoss.zstl.ZTL4ScalaTestCase
import org.junit.Test

@Tags(tags = "B65-ZK-1997.zul")
class B65_ZK_1997Test extends ZTL4ScalaTestCase {

  @Test
  def testClick() = {
    val zscript = """<?xml version="1.0" encoding="UTF-8"?>

<!--
B65-ZK-1997.zul

	Purpose:
		
	Description:
		
	History:
		Tue, Nov 05, 2013 11:09:12 AM, Created by jumperchen

Copyright (C) 2013 Potix Corporation. All Rights Reserved.

-->
<zk>
	<label multiline="true">
		1. Please drag the first panel and then drop it in the same position (i.e. where it dragged from)
		2. You should not see any dialog.
	</label>
	<portallayout id="portalLayout" maximizedMode="whole" onPortalMove='alert("if you can see this, that is a bug")'>
		<portalchildren style="padding: 5px" width="30%">
			<panel id="wiki" height="300px" title="Random Wikipedia" border="normal" collapsible="true" closable="true" maximizable="true" style="margin-bottom:10px">
				<panelchildren>
					<iframe width="100%" height="100%"
						src="http://www.gmodules.com/ig/ifr?url=http://www.therandomhomepage.com/google/gadgets/randomwiki/RandomWikiModule.xml&amp;up_moduletitle=Random%20Wikipedia%20Article&amp;up_language=en&amp;synd=open&amp;w=320&amp;h=350&amp;title=__UP_moduletitle__&amp;lang=en&amp;country=ALL&amp;border=%23ffffff|3px%2C1px+solid+%23999999&amp;source=http%3A%2F%2Fwww.gmodules.com%2Fig%2Fcreator%3Fsynd%3Dopen%26url%3Dhttp%253A%2F%2Fwww.therandomhomepage.com%2Fgoogle%2Fgadgets%2Frandomwiki%2FRandomWikiModule.xml%26pt%3D%2526context%253Dd%2526type%253Dgadgets%2526synd%253Dig%2526lang%253Den%2526.lang%253Den%2526country%253Dau%2526.country%253Dau%2526start%253D0%2526num%253D1%2526target%253Dx5%2526objs%253D0KPR%252CyN%26sn%3Dx5%26lang%3Den" />
				</panelchildren>
			</panel>
			<panel id="tool" height="200px" title="Google Tools" border="normal" collapsible="true" closable="true" maximizable="true" style="margin-bottom:10px">
				<panelchildren>
					<iframe width="100%" height="100%"
						src="http://3.gmodules.com/ig/ifr?url=http://www.google.com/ig/modules/toolspromo.xml&amp;nocache=0&amp;lang=en&amp;country=us&amp;.lang=en&amp;.country=us&amp;synd=ig&amp;mid=3&amp;ifpctok=5090480830848781425&amp;parent=http://www.google.com&amp;extern_js=/extern_js/f/CgJlbhICdXMrMAs4ACwrMBA4ACwrMBI4ACwrMBM4ACw/zYieI_ujwr4.js" />
				</panelchildren>
			</panel>
		</portalchildren>

		<portalchildren style="padding: 5px" width="40%">
			<panel id="todo" height="300px" title="ToDo" border="normal" collapsible="true" closable="true" maximizable="true" style="margin-bottom:10px">
				<panelchildren>
					<iframe width="100%" height="100%"
						src="http://www-igprev-opensocial.googleusercontent.com/gadgets/ifr?exp_rpc_js=1&amp;exp_track_js=1&amp;url=http%3A%2F%2Fwww.labpixies.com%2Fcampaigns%2Ftodo%2Ftodo.xml&amp;container=igprev&amp;view=preview&amp;lang=en&amp;country=TW&amp;sanitize=0&amp;v=320983f4a0c1ed26&amp;parent=http://www.google.com.tw&amp;libs=core:core.io:core.iglegacy:auth-refresh&amp;is_signedin=1&amp;synd=igprev&amp;view=preview#st=&amp;gadgetId=104349211979182719780&amp;gadgetOwner=100905887646364935951&amp;gadgetViewer=100905887646364935951&amp;rpctoken=-1064182856&amp;ifpctok=-1064182856&amp;up_sd=&amp;up_todos=&amp;up_saved_tasks=&amp;up_wasSocial=0&amp;up_migration_flag=false" />
				</panelchildren>
			</panel>
			<panel id="clock" height="250px" title="LabPixies Clock" border="normal" collapsible="true" closable="true" maximizable="true" style="margin-bottom:10px">
				<panelchildren>
					<iframe width="100%" height="100%"
						src="http://ig.gmodules.com/gadgets/ifr?url=http://www.labpixies.com/campaigns/clock/mini_clock.xml&amp;nocache=0&amp;up_skin_id=&amp;upt_skin_id=hidden&amp;lang=en&amp;country=us&amp;.lang=en&amp;.country=us&amp;synd=ig&amp;mid=34&amp;ifpctok=-3234052241260630457&amp;parent=http://www.google.com&amp;extern_js=/extern_js/f/CgJlbhICdXMrMBI4ACwrMBM4ACw/v3vgcgA0x8g.js" />
				</panelchildren>
			</panel>
		</portalchildren>

		<portalchildren style="padding: 5px" width="30%">
			<panel id="trio" height="400px" title="Trio" border="normal" collapsible="true" closable="true" maximizable="true" style="margin-bottom:10px">
				<panelchildren>
					<iframe width="100%" height="100%"
						src="http://ig.gmodules.com/gadgets/ifr?url=http://www.labpixies.com/campaigns/trio/trio.xml&amp;nocache=0&amp;lang=en&amp;country=us&amp;.lang=en&amp;.country=us&amp;synd=ig&amp;mid=35&amp;ifpctok=7430207052966295609&amp;parent=http://www.google.com&amp;extern_js=/extern_js/f/CgJlbhICdXMrMBI4ACwrMBM4ACw/v3vgcgA0x8g.js" />
				</panelchildren>
			</panel>
		</portalchildren>
	</portallayout>
</zk>"""
    runZTL(zscript,
      () => {
        val position = "2,2"
        val src = jq(".z-panel")
        val target = jq(".z-panel")
        mouseMoveAt(src, position)
        waitResponse

        mouseDownAt(src, position)
        waitResponse

        val position1 = "10,10"
        mouseMoveAt(target, position1)
        waitResponse

        mouseUpAt(target, position1)
        waitResponse
        verifyTrue("You should not see any dialog.", !jq(".z-window").exists)
      })

  }
}