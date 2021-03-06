package org.zkoss.zktest.test2.B70

import org.zkoss.ztl.Tags
import org.zkoss.zstl.ZTL4ScalaTestCase
import org.junit.Test

@Tags(tags = "B70-ZK-2101.zul")
class B70_ZK_2101Test extends ZTL4ScalaTestCase {

@Test
def testClick() = {
  val zscript = """<zk>
	<window title="2-way collapsible tree" border="normal"
		width="1000px">
		<div>
			scroll to middle and click '+/-' toolbarbutton,
			then should not show empty header. 
		</div>
		<tree mold="paging" pageSize="6">
			<frozen columns="1" start="2"></frozen>
			<auxhead>
				<auxheader></auxheader>
				<auxheader colspan="4">2013</auxheader>
				<auxheader colspan="16">2014</auxheader>
			</auxhead>
			<auxhead>
				<auxheader>Time Series</auxheader>
				<auxheader align="center" colspan="4">
					<toolbarbutton mode="toggle" checked="true"
						label="+ / -"
						onClick="col2013_10.setVisible(!col2013_10.isVisible()); col2013_11.setVisible(!col2013_11.isVisible()); col2013_12.setVisible(!col2013_12.isVisible()); " />
					Q4
				</auxheader>
				<auxheader align="center" colspan="4">
					<toolbarbutton mode="toggle" checked="true"
						label="+ / -"
						onClick="col2014_01.setVisible(!col2014_01.isVisible()); col2014_02.setVisible(!col2014_02.isVisible()); col2014_03.setVisible(!col2014_03.isVisible()); " />
					Q1
				</auxheader>
				<auxheader align="center" colspan="4">
					<toolbarbutton mode="toggle" checked="true"
						label="+ / -"
						onClick="col2014_04.setVisible(!col2014_04.isVisible()); col2014_05.setVisible(!col2014_05.isVisible()); col2014_06.setVisible(!col2014_06.isVisible()); " />
					Q2
				</auxheader>
				<auxheader align="center" colspan="4">
					<toolbarbutton mode="toggle" checked="true"
						label="+ / -"
						onClick="col2014_07.setVisible(!col2014_07.isVisible()); col2014_08.setVisible(!col2014_08.isVisible()); col2014_09.setVisible(!col2014_09.isVisible()); " />
					Q3
				</auxheader>
				<auxheader align="center" colspan="4">
					<toolbarbutton mode="toggle" checked="true"
						label="+ / -"
						onClick="col2014_10.setVisible(!col2014_10.isVisible()); col2014_11.setVisible(!col2014_11.isVisible()); col2014_12.setVisible(!col2014_12.isVisible()); " />
					Q4
				</auxheader>
			</auxhead>

			<treecols>
				<treecol label="hierarchy below" width="300px" />
				<treecol id="col2013_10" label="Oct 2013" width="60px" />
				<treecol id="col2013_11" label="Nov 2013" width="60px" />
				<treecol id="col2013_12" label="Dec 2013" width="60px" />
				<treecol label="Quarter" width="60px" />
				<treecol id="col2014_01" label="Jan 2014" width="60px" />
				<treecol id="col2014_02" label="Feb 2014" width="60px" />
				<treecol id="col2014_03" label="Mar 2014" width="60px" />
				<treecol label="Quarter" width="60px" />
				<treecol id="col2014_04" label="Apr 2014" width="60px" />
				<treecol id="col2014_05" label="May 2014" width="60px" />
				<treecol id="col2014_06" label="Jun 2014" width="60px" />
				<treecol label="Quarter" width="60px" />
				<treecol id="col2014_07" label="Jul 2014" width="60px" />
				<treecol id="col2014_08" label="Aug 2014" width="60px" />
				<treecol id="col2014_09" label="Sep 2014" width="60px" />
				<treecol label="Quarter" width="60px" />
				<treecol id="col2014_10" label="Oct 2014" width="60px" />
				<treecol id="col2014_11" label="Nov 2014" width="60px" />
				<treecol id="col2014_12" label="Dec 2014" width="60px" />
				<treecol label="Quarter" width="60px" />
			</treecols>

			<treechildren>
				<treeitem>
					<treerow>
						<treecell label="1.2.2 AAAAA_bbbbb_details 2" />
						<treecell label="80" />
						<treecell label="90" />
						<treecell label="100" />
						<treecell label="270" />
						<treecell label="120" />
						<treecell label="130" />
						<treecell label="140" />
						<treecell label="390" />
						<treecell label="160" />
						<treecell label="170" />
						<treecell label="180" />
						<treecell label="510" />
						<treecell label="200" />
						<treecell label="210" />
						<treecell label="220" />
						<treecell label="630" />
						<treecell label="240" />
						<treecell label="250" />
						<treecell label="260" />
						<treecell label="750" />
					</treerow>
				</treeitem>
			</treechildren>
		</tree>
	</window>
</zk>"""  
  runZTL(zscript,
    () => {
      frozenScroll(jq(".z-tree"), 10)
      click(jq(".z-toolbarbutton:eq(2)"))
      waitResponse()
      verifyImage()
    })
    
  }
}