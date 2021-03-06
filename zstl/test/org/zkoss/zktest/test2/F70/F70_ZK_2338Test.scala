package org.zkoss.zktest.test2.F70

import org.zkoss.ztl.Tags
import org.zkoss.zstl.ZTL4ScalaTestCase
import org.junit.Test

@Tags(tags = "F70-ZK-2338.zul")
class F70_ZK_2338Test extends ZTL4ScalaTestCase {

@Test
def testClick() = {
  val zscript = """<?page title="F70-ZK-2049" contentType="text/html;charset=UTF-8"?>
<!--
F70-ZK-2338.zul

	Purpose:
		
	Description:
		
	History:
		Wed, July 2, 2014  12:41:04 PM, Created by jerrychen

Copyright (C)  Potix Corporation. All Rights Reserved.

-->
<window>
	You should see four words "HelloWorld", "HelloWorld3", "HelloWorld34", "HelloWorld345".
	<separator/>
	
	<zscript>
	public class ABC{
		public String toString(){return "World";}
	}
	</zscript>
	<zscript>
 		ABC d = new ABC();
	</zscript>
	<label value="${c:cat('Hello', d)}"/><separator/>
	<label value="${c:cat3('Hello', d, 3)}"/><separator/>
	<label value="${c:cat4('Hello', d, 3, 4)}"/><separator/>
	<label value="${c:cat5('Hello', d, 3, 4, 5)}"/><separator/>
</window>
"""  
  runZTL(zscript,
    () => {
      val ls = jq("@label");
      println(ls.eq(1).html());
      verifyTrue(ls.eq(1).html().equals("HelloWorld"));
      verifyTrue(ls.eq(2).html().equals("HelloWorld3"));
      verifyTrue(ls.eq(3).html().equals("HelloWorld34"));
      verifyTrue(ls.eq(4).html().equals("HelloWorld345"));
    })
    
  }
}