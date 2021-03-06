package org.zkoss.zktest.test2.B65

import org.zkoss.ztl.Tags
import org.zkoss.zstl.ZTL4ScalaTestCase
import org.junit.Test

@Tags(tags = "B65-ZK-1985.zul")
class B65_ZK_1985Test extends ZTL4ScalaTestCase {

@Test
def testClick() = {
  val zscript = """<?page title="new page title" contentType="text/html;charset=UTF-8"?>
<zk>
<div>
	should see a parsed date and 25 'undefined's in zk.log
</div>
	<script>
		zk.load('zul.db', function () { 
		var fmt = "MMM d, yyyy HH:mm:ss",
			d = zk.fmt.Date.parseDate("Oct 18, 2011 11:11:11", fmt, true),
			d0 = zk.fmt.Date.parseDate("Oct 18, 20d11 11:11:11", fmt, true),
			d1 = zk.fmt.Date.parseDate("Oct 18, 20M11 11:11:11", fmt, true),
			d2 = zk.fmt.Date.parseDate("Oct 18, 20y11 11:11:11", fmt, true),
			d3 = zk.fmt.Date.parseDate("Oct 18, 20,11 11:11:11", fmt, true),
			d4 = zk.fmt.Date.parseDate("Oct 18, 20 11 11:11:11", fmt, true),
			d5 = zk.fmt.Date.parseDate("Oct 1d8, 2011 11:11:11", fmt, true),
			d6 = zk.fmt.Date.parseDate("Oct 1M8, 2011 11:11:11", fmt, true),
			d7 = zk.fmt.Date.parseDate("Oct 1y8, 2011 11:11:11", fmt, true),
			d8 = zk.fmt.Date.parseDate("Oct 1,8, 2011 11:11:11", fmt, true),
			d9 = zk.fmt.Date.parseDate("Oct 1 8, 2011 11:11:11", fmt, true),
			d10 = zk.fmt.Date.parseDate("Oct 18, 2011 1d1:11:11", fmt, true),
			d11 = zk.fmt.Date.parseDate("Oct 18, 2011 1M1:11:11", fmt, true),
			d12 = zk.fmt.Date.parseDate("Oct 18, 2011 1y1:11:11", fmt, true),
			d13 = zk.fmt.Date.parseDate("Oct 18, 2011 1 1:11:11", fmt, true),
			d14 = zk.fmt.Date.parseDate("Oct 18, 2011 1,1:11:11", fmt, true),
			d15 = zk.fmt.Date.parseDate("Oct 18, 2011 11:1d1:11", fmt, true),
			d16 = zk.fmt.Date.parseDate("Oct 18, 2011 11:1M1:11", fmt, true),
			d17 = zk.fmt.Date.parseDate("Oct 18, 2011 11:1y1:11", fmt, true),
			d18 = zk.fmt.Date.parseDate("Oct 18, 2011 11:1 1:11", fmt, true),
			d19 = zk.fmt.Date.parseDate("Oct 18, 2011 11:1,1:11", fmt, true),
			d20 = zk.fmt.Date.parseDate("Oct 18, 2011 11:11:1d1", fmt, true),
			d21 = zk.fmt.Date.parseDate("Oct 18, 2011 11:11:1M1", fmt, true),
			d22 = zk.fmt.Date.parseDate("Oct 18, 2011 11:11:1y1", fmt, true),
			d23 = zk.fmt.Date.parseDate("Oct 18, 2011 11:11:1 1", fmt, true),
			d24 = zk.fmt.Date.parseDate("Oct 18, 2011 11:11:1,1", fmt, true);

		zk.log(d ? d : 'undefined');
		zk.log(d0 ? d0 : 'undefined');
		zk.log(d1 ? d1 : 'undefined');
		zk.log(d2 ? d2 : 'undefined');
		zk.log(d3 ? d3 : 'undefined');
		zk.log(d4 ? d4 : 'undefined');
		zk.log(d5 ? d5 : 'undefined');
		zk.log(d6 ? d6 : 'undefined');
		zk.log(d7 ? d7 : 'undefined');
		zk.log(d8 ? d8 : 'undefined');
		zk.log(d9 ? d9 : 'undefined');
		zk.log(d10 ? d10 : 'undefined');
		zk.log(d11 ? d11 : 'undefined');
		zk.log(d12 ? d12 : 'undefined');
		zk.log(d13 ? d13 : 'undefined');
		zk.log(d14 ? d14 : 'undefined');
		zk.log(d15 ? d15 : 'undefined');
		zk.log(d16 ? d16 : 'undefined');
		zk.log(d17 ? d17 : 'undefined');
		zk.log(d18 ? d18 : 'undefined');
		zk.log(d19 ? d19 : 'undefined');
		zk.log(d20 ? d20 : 'undefined');
		zk.log(d21 ? d21 : 'undefined');
		zk.log(d22 ? d22 : 'undefined');
		zk.log(d23 ? d23 : 'undefined');
		zk.log(d24 ? d24 : 'undefined'); })
	</script>
</zk>"""  
  runZTL(zscript,
    () => {
      sleep(500)
      val txt = jq("#zk_log").`val`()
      val txts = txt.split("\n")
      
      val hasParsedDate = !txts(0).contains("undefined")
      val count = txt.split("\n").count(_ == "undefined")
      verifyTrue("should see a parsed date and 25 'undefined's in zk.log", hasParsedDate && count == 25)
    })
    
  }
}