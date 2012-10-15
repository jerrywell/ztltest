package org.zkoss.zktest.test2.theme

import org.zkoss.zstl.ZTL4ScalaTestCase
import org.zkoss.ztl.Tags

@Tags(tags = "Android,VisionTest")
class Thm_Grid_Detail extends ZTL4ScalaTestCase {
	def testClick() = {
		val zscript = """
<grid fixedLayout="true" width="600px">
	<columns>
		<column width="40px" />
		<column label="Product Name"/>
		<column width="100px" label="Price"/>
		<column label="Item location"/>
	</columns>
	<rows>
		<row>
			<detail open="true">
				<hbox>
					<image sclass="myimg" width="100px" height="100px"
						src="/img/item1.jpg" />
					<vbox>
						<label
							value="Item Specifics - Item Condition	"
							style="font-weight:bold;font-style: italic;" />
						<hbox>
							<label value="Condition:" />
							<label value="Used"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="Brand:" />
							<label value="Apple"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="Technology:" />
							<label value="DVI"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="Monitor Type:" />
							<label value="LCD/Flat Panel"
								style="font-weight:bold;" />
						</hbox>
					</vbox>
				</hbox>
			</detail>
			<label
				value="Apple 20-inch Aluminum Cinema Display M9177/A" />
			<label style="color:green;float:right;"
				value="US $202.50" />
			<label value="tulsa, ok, United States" />
		</row>
		
		<row>
			<detail fulfill="onOpen">
				<hbox>
					<image sclass="myimg" width="100px" height="100px"
						src="/img/item2.jpg" />
					<vbox>
						<label
							value="Item Specifics"
							style="font-weight:bold;font-style: italic;" />
						<hbox>
							<label value="Condition:" />
							<label value="Used"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="Brand:" />
							<label value="Kyocera"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="Phone Type:" />
							<label value="Phones without Service Contrac"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="Product Type:" />
							<label value="Cell Phones"
								style="font-weight:bold;" />
						</hbox>
					</vbox>
				</hbox>
			</detail>
			<label
				value="Kyocera Strobe K612B MetroPCS Metro PCS Cell Phone L@@K" />
			<label style="color:green;float:right;"
				value="US $74.99" />
			<label value="Speedy Shipping, USA, United States" />
		</row>
		<row>
			<detail fulfill="onOpen">
				<hbox>
					<image sclass="myimg" width="100px" height="100px"
						src="/img/item3.jpg" />
					<vbox>
						<label
							value="Item Specifics - Video Game Systems"
							style="font-weight:bold;font-style: italic;" />
						<hbox>
							<label value="Manufacturer:" />
							<label value="Microsoft"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="Platform:" />
							<label value="Microsoft Xbox 360"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="MPN:" />
							<label value="52T-00013"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="Condition:" />
							<label value="Used"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="Condition:" />
							<label value="Used"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="Media Type:" />
							<label value="DVD-ROM"
								style="font-weight:bold;" />
						</hbox>
					</vbox>
				</hbox>
			</detail>
			<label
				value="Halo 3 ed. xbox 360 bundle pack" />
			<label style="color:green;float:right;"
				value="US $350.00" />
			<label value="middletown, PA, United States" />
		</row>
		
		<row>
			<detail fulfill="onOpen">
				<hbox>
					<image sclass="myimg" width="100px" height="100px"
						src="/img/item4.jpg" />
					<vbox>
						<label
							value="Item Specifics - Cell Phones &amp; Smartphones"
							style="font-weight:bold;font-style: italic;" />
						<hbox>
							<label value="Carrier:" />
							<label value="AT&amp;T, Cingular"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="Brand:" />
							<label value="Apple iPhone"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="Technology:" />
							<label value="GSM"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="Camera:" />
							<label value="1-2 Megapixels"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="Condition:" />
							<label value="Used"
								style="font-weight:bold;" />
						</hbox>
						<hbox>
							<label value="Features:" />
							<label value="Bluetooth Enabled, Calendar, Color Screen, Email Access, GPS, Internet Browser, MP3 Player, PDA-PC Sync, SMS-Text Messaging, Speakerphone, Touch Screen, USB Interface"
								style="font-weight:bold;" />
						</hbox>
					</vbox>
				</hbox>
			</detail>
			<label
				value="Apple iPhone 8GB - 1st Generation, Version 2.0" />
			<label style="color:green;float:right;"
				value="US $300.00" />
			<label value="Aspen, Co, United States" />
		</row>
	</rows>
</grid>""";

		runZTL(zscript,
			() => {
				verifyImage();
				
				singleTap(jq(".z-detail:eq(1)"));
				sleep(500);
				verifyImage();
			});
	}
}