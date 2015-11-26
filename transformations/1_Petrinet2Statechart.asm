<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="Petrinet2Statechart"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchPnet2Statechart():V"/>
		<constant value="__exec__"/>
		<constant value="Pnet2Statechart"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyPnet2Statechart(NTransientLink;):V"/>
		<constant value="__matchPnet2Statechart"/>
		<constant value="Net"/>
		<constant value="petrinet"/>
		<constant value="pnetInput"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="pnet"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="schart"/>
		<constant value="Statechart"/>
		<constant value="statechart"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="t"/>
		<constant value="AND"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="13:3-15:4"/>
		<constant value="16:3-20:4"/>
		<constant value="__applyPnet2Statechart"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="4"/>
		<constant value="topState"/>
		<constant value="top"/>
		<constant value="places"/>
		<constant value="5"/>
		<constant value="J.Place2OR(J):J"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="transitions"/>
		<constant value="J.Transition2HyperEdge(J):J"/>
		<constant value="J.union(J):J"/>
		<constant value="contains"/>
		<constant value="14:16-14:17"/>
		<constant value="14:4-14:17"/>
		<constant value="17:12-17:17"/>
		<constant value="17:4-17:17"/>
		<constant value="18:16-18:20"/>
		<constant value="18:16-18:27"/>
		<constant value="18:43-18:53"/>
		<constant value="18:63-18:64"/>
		<constant value="18:43-18:65"/>
		<constant value="18:16-18:66"/>
		<constant value="19:15-19:19"/>
		<constant value="19:15-19:31"/>
		<constant value="19:47-19:57"/>
		<constant value="19:79-19:80"/>
		<constant value="19:47-19:81"/>
		<constant value="19:15-19:82"/>
		<constant value="18:16-19:84"/>
		<constant value="18:4-19:84"/>
		<constant value="p"/>
		<constant value="link"/>
		<constant value="Place2OR"/>
		<constant value="Mpetrinet!Place;"/>
		<constant value="o"/>
		<constant value="OR"/>
		<constant value="b"/>
		<constant value="Basic"/>
		<constant value=""/>
		<constant value="Set"/>
		<constant value="rcontains"/>
		<constant value="29:12-29:14"/>
		<constant value="29:4-29:14"/>
		<constant value="30:20-30:21"/>
		<constant value="30:16-30:22"/>
		<constant value="30:4-30:22"/>
		<constant value="28:3-31:4"/>
		<constant value="33:12-33:13"/>
		<constant value="33:12-33:18"/>
		<constant value="33:4-33:18"/>
		<constant value="34:17-34:18"/>
		<constant value="34:4-34:18"/>
		<constant value="32:3-35:4"/>
		<constant value="Transition2HyperEdge"/>
		<constant value="Mpetrinet!Transaction;"/>
		<constant value="h"/>
		<constant value="HyperEdge"/>
		<constant value="43:12-43:14"/>
		<constant value="43:4-43:14"/>
		<constant value="44:20-44:21"/>
		<constant value="44:16-44:22"/>
		<constant value="44:4-44:22"/>
		<constant value="42:3-45:4"/>
		<constant value="47:12-47:13"/>
		<constant value="47:12-47:18"/>
		<constant value="47:4-47:18"/>
		<constant value="48:17-48:18"/>
		<constant value="48:4-48:18"/>
		<constant value="46:3-48:19"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="41">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="42"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="44"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="0" name="17" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="45">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="46"/>
			<push arg="47"/>
			<findme/>
			<push arg="48"/>
			<call arg="49"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="42"/>
			<pcall arg="51"/>
			<dup/>
			<push arg="52"/>
			<load arg="19"/>
			<pcall arg="53"/>
			<dup/>
			<push arg="54"/>
			<push arg="55"/>
			<push arg="56"/>
			<new/>
			<pcall arg="57"/>
			<dup/>
			<push arg="58"/>
			<push arg="59"/>
			<push arg="56"/>
			<new/>
			<pcall arg="57"/>
			<pusht/>
			<pcall arg="60"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="61" begin="19" end="24"/>
			<lne id="62" begin="25" end="30"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="52" begin="6" end="32"/>
			<lve slot="0" name="17" begin="0" end="33"/>
		</localvariabletable>
	</operation>
	<operation name="63">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="64"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="52"/>
			<call arg="65"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="54"/>
			<call arg="66"/>
			<store arg="67"/>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="66"/>
			<store arg="68"/>
			<load arg="67"/>
			<dup/>
			<getasm/>
			<load arg="68"/>
			<call arg="30"/>
			<set arg="69"/>
			<pop/>
			<load arg="68"/>
			<dup/>
			<getasm/>
			<push arg="70"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="71"/>
			<iterate/>
			<store arg="72"/>
			<getasm/>
			<load arg="72"/>
			<call arg="73"/>
			<call arg="74"/>
			<enditerate/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="75"/>
			<iterate/>
			<store arg="72"/>
			<getasm/>
			<load arg="72"/>
			<call arg="76"/>
			<call arg="74"/>
			<enditerate/>
			<call arg="77"/>
			<call arg="30"/>
			<set arg="78"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="79" begin="15" end="15"/>
			<lne id="80" begin="13" end="17"/>
			<lne id="61" begin="12" end="18"/>
			<lne id="81" begin="22" end="22"/>
			<lne id="82" begin="20" end="24"/>
			<lne id="83" begin="30" end="30"/>
			<lne id="84" begin="30" end="31"/>
			<lne id="85" begin="34" end="34"/>
			<lne id="86" begin="35" end="35"/>
			<lne id="87" begin="34" end="36"/>
			<lne id="88" begin="27" end="38"/>
			<lne id="89" begin="42" end="42"/>
			<lne id="90" begin="42" end="43"/>
			<lne id="91" begin="46" end="46"/>
			<lne id="92" begin="47" end="47"/>
			<lne id="93" begin="46" end="48"/>
			<lne id="94" begin="39" end="50"/>
			<lne id="95" begin="27" end="51"/>
			<lne id="96" begin="25" end="53"/>
			<lne id="62" begin="19" end="54"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="5" name="97" begin="33" end="37"/>
			<lve slot="5" name="58" begin="45" end="49"/>
			<lve slot="3" name="54" begin="7" end="54"/>
			<lve slot="4" name="58" begin="11" end="54"/>
			<lve slot="2" name="52" begin="3" end="54"/>
			<lve slot="0" name="17" begin="0" end="54"/>
			<lve slot="1" name="98" begin="0" end="54"/>
		</localvariabletable>
	</operation>
	<operation name="99">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="100"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="99"/>
			<pcall arg="51"/>
			<dup/>
			<push arg="97"/>
			<load arg="19"/>
			<pcall arg="53"/>
			<dup/>
			<push arg="101"/>
			<push arg="102"/>
			<push arg="56"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="103"/>
			<push arg="104"/>
			<push arg="56"/>
			<new/>
			<dup/>
			<store arg="67"/>
			<pcall arg="57"/>
			<pushf/>
			<pcall arg="60"/>
			<load arg="29"/>
			<dup/>
			<getasm/>
			<push arg="105"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<push arg="106"/>
			<push arg="8"/>
			<new/>
			<load arg="67"/>
			<call arg="74"/>
			<call arg="30"/>
			<set arg="78"/>
			<pop/>
			<load arg="67"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<set arg="107"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="108" begin="33" end="33"/>
			<lne id="109" begin="31" end="35"/>
			<lne id="110" begin="41" end="41"/>
			<lne id="111" begin="38" end="42"/>
			<lne id="112" begin="36" end="44"/>
			<lne id="113" begin="30" end="45"/>
			<lne id="114" begin="49" end="49"/>
			<lne id="115" begin="49" end="50"/>
			<lne id="116" begin="47" end="52"/>
			<lne id="117" begin="55" end="55"/>
			<lne id="118" begin="53" end="57"/>
			<lne id="119" begin="46" end="58"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="101" begin="18" end="59"/>
			<lve slot="3" name="103" begin="26" end="59"/>
			<lve slot="0" name="17" begin="0" end="59"/>
			<lve slot="1" name="97" begin="0" end="59"/>
		</localvariabletable>
	</operation>
	<operation name="120">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="121"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="120"/>
			<pcall arg="51"/>
			<dup/>
			<push arg="58"/>
			<load arg="19"/>
			<pcall arg="53"/>
			<dup/>
			<push arg="101"/>
			<push arg="102"/>
			<push arg="56"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="122"/>
			<push arg="123"/>
			<push arg="56"/>
			<new/>
			<dup/>
			<store arg="67"/>
			<pcall arg="57"/>
			<pushf/>
			<pcall arg="60"/>
			<load arg="29"/>
			<dup/>
			<getasm/>
			<push arg="105"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<push arg="106"/>
			<push arg="8"/>
			<new/>
			<load arg="67"/>
			<call arg="74"/>
			<call arg="30"/>
			<set arg="78"/>
			<pop/>
			<load arg="67"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<set arg="107"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="124" begin="33" end="33"/>
			<lne id="125" begin="31" end="35"/>
			<lne id="126" begin="41" end="41"/>
			<lne id="127" begin="38" end="42"/>
			<lne id="128" begin="36" end="44"/>
			<lne id="129" begin="30" end="45"/>
			<lne id="130" begin="49" end="49"/>
			<lne id="131" begin="49" end="50"/>
			<lne id="132" begin="47" end="52"/>
			<lne id="133" begin="55" end="55"/>
			<lne id="134" begin="53" end="57"/>
			<lne id="135" begin="46" end="58"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="101" begin="18" end="59"/>
			<lve slot="3" name="122" begin="26" end="59"/>
			<lve slot="0" name="17" begin="0" end="59"/>
			<lve slot="1" name="58" begin="0" end="59"/>
		</localvariabletable>
	</operation>
</asm>
