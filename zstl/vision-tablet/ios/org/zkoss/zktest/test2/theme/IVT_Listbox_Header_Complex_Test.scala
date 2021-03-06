package org.zkoss.zktest.test2.theme

import org.zkoss.zstl.ZTL4ScalaTestCase
import org.zkoss.ztl.Tags
import org.zkoss.ztl.Tags

@Tags(tags = "IOS,VisionTest")
class IVT_Listbox_Header_Complex_Test extends ZTL4ScalaTestCase {
	def testClick() = {
		val zscript = """
<listbox>
	<auxhead>
		<auxheader colspan="2">
			<label id="span">ss</label>
			<textbox onChange='span.value = self.value' />
			<datebox />
			ssss
		</auxheader>
	</auxhead>
	<listhead sizable="true">
		<listheader sort="auto">
			<toolbarbutton label="toobarbutton"
				onClick='alert(self.label)' />
			<menubar>
				<menu label="File">
					<menupopup>
						<menuitem label="New"
							onClick="alert(self.label)" />
						<menuitem label="Open"
							onClick="alert(self.label)" />
						<menuitem label="Save"
							onClick="alert(self.label)" />
						<menuseparator />
						<menuitem label="Exit"
							onClick="alert(self.label)" />
					</menupopup>
				</menu>
				<menu label="Help">
					<menupopup>
						<menuitem label="Index"
							onClick="alert(self.label)" />
						<menu label="About">
							<menupopup>
								<menuitem label="About ZK"
									onClick="alert(self.label)" />
								<menuitem
									label="About Potix" onClick="alert(self.label)" />
							</menupopup>
						</menu>
					</menupopup>
				</menu>
			</menubar>
			<button label="lable" onClick='alert("button")' />
			<datebox />
		</listheader>
		<listheader>
			<listbox rows="1" mold="select">
				<listitem label="option1" />
				<listitem label="option2" />
				<listitem label="option3" />
			</listbox>
		</listheader>
	</listhead>
	<listitem>
		<listcell label="Mary" />
		<listcell label="FEMALE" />
	</listitem>
	<listitem>
		<listcell label="John" />
		<listcell label="MALE" />
	</listitem>
	<listitem>
		<listcell label="Jane" />
		<listcell label="FEMALE" />
	</listitem>
	<listitem>
		<listcell label="Henry" />
		<listcell label="MALE" />
	</listitem>
</listbox>
		""";

		runZTL(zscript,
			() => {
				verifyImage();
			});
	}
}
