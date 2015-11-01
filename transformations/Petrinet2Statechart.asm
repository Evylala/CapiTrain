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
		<constant value="input"/>
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
		<constant value="o"/>
		<constant value="places"/>
		<constant value="OR"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="h"/>
		<constant value="transitions"/>
		<constant value="HyperEdge"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="9:3-11:4"/>
		<constant value="12:3-15:4"/>
		<constant value="16:46-16:50"/>
		<constant value="16:46-16:57"/>
		<constant value="16:3-19:4"/>
		<constant value="20:58-20:62"/>
		<constant value="20:58-20:74"/>
		<constant value="20:3-22:4"/>
		<constant value="__applyPnet2Statechart"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="4"/>
		<constant value="5"/>
		<constant value="6"/>
		<constant value="topState"/>
		<constant value="top"/>
		<constant value="Set"/>
		<constant value="contains"/>
		<constant value="7"/>
		<constant value="CJ.asSequence():QJ"/>
		<constant value="8"/>
		<constant value="QJ.at(I):J"/>
		<constant value="9"/>
		<constant value=""/>
		<constant value="B.not():B"/>
		<constant value="66"/>
		<constant value="J.Place2Basic(J):J"/>
		<constant value="81"/>
		<constant value="I.+(I):I"/>
		<constant value="113"/>
		<constant value="10:16-10:17"/>
		<constant value="10:4-10:17"/>
		<constant value="13:12-13:17"/>
		<constant value="13:4-13:17"/>
		<constant value="14:20-14:21"/>
		<constant value="14:16-14:22"/>
		<constant value="14:4-14:22"/>
		<constant value="17:12-17:14"/>
		<constant value="17:4-17:14"/>
		<constant value="18:16-18:26"/>
		<constant value="18:39-18:44"/>
		<constant value="18:16-18:45"/>
		<constant value="18:4-18:45"/>
		<constant value="21:12-21:22"/>
		<constant value="21:12-21:27"/>
		<constant value="21:4-21:27"/>
		<constant value="place"/>
		<constant value="collection"/>
		<constant value="counter"/>
		<constant value="transition"/>
		<constant value="link"/>
		<constant value="Place2Basic"/>
		<constant value="Mpetrinet!Place;"/>
		<constant value="p"/>
		<constant value="b"/>
		<constant value="Basic"/>
		<constant value="30:12-30:13"/>
		<constant value="30:12-30:18"/>
		<constant value="30:4-30:18"/>
		<constant value="29:3-31:4"/>
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
			<dup/>
			<push arg="60"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<get arg="61"/>
			<iterate/>
			<pop/>
			<push arg="62"/>
			<push arg="56"/>
			<new/>
			<call arg="63"/>
			<enditerate/>
			<pcall arg="57"/>
			<dup/>
			<push arg="64"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<get arg="65"/>
			<iterate/>
			<pop/>
			<push arg="66"/>
			<push arg="56"/>
			<new/>
			<call arg="63"/>
			<enditerate/>
			<pcall arg="57"/>
			<pusht/>
			<pcall arg="67"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="68" begin="19" end="24"/>
			<lne id="69" begin="25" end="30"/>
			<lne id="70" begin="36" end="36"/>
			<lne id="71" begin="36" end="37"/>
			<lne id="72" begin="31" end="45"/>
			<lne id="73" begin="51" end="51"/>
			<lne id="74" begin="51" end="52"/>
			<lne id="75" begin="46" end="60"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="52" begin="6" end="62"/>
			<lve slot="0" name="17" begin="0" end="63"/>
		</localvariabletable>
	</operation>
	<operation name="76">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="77"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="52"/>
			<call arg="78"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="54"/>
			<call arg="79"/>
			<store arg="80"/>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="79"/>
			<store arg="81"/>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="79"/>
			<store arg="82"/>
			<load arg="19"/>
			<push arg="64"/>
			<call arg="79"/>
			<store arg="83"/>
			<load arg="80"/>
			<dup/>
			<getasm/>
			<load arg="81"/>
			<call arg="30"/>
			<set arg="84"/>
			<pop/>
			<load arg="81"/>
			<dup/>
			<getasm/>
			<push arg="85"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<push arg="86"/>
			<push arg="8"/>
			<new/>
			<load arg="82"/>
			<call arg="63"/>
			<call arg="30"/>
			<set arg="87"/>
			<pop/>
			<pushi arg="19"/>
			<store arg="88"/>
			<load arg="29"/>
			<get arg="61"/>
			<call arg="89"/>
			<store arg="90"/>
			<load arg="82"/>
			<iterate/>
			<load arg="90"/>
			<load arg="88"/>
			<call arg="91"/>
			<store arg="92"/>
			<dup/>
			<getasm/>
			<push arg="93"/>
			<dup/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<call arg="94"/>
			<if arg="95"/>
			<load arg="88"/>
			<call arg="91"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<getasm/>
			<load arg="92"/>
			<call arg="96"/>
			<dup/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<call arg="94"/>
			<if arg="97"/>
			<load arg="88"/>
			<call arg="91"/>
			<call arg="30"/>
			<set arg="87"/>
			<pop/>
			<load arg="88"/>
			<pushi arg="19"/>
			<call arg="98"/>
			<store arg="88"/>
			<enditerate/>
			<pushi arg="19"/>
			<store arg="88"/>
			<load arg="29"/>
			<get arg="65"/>
			<call arg="89"/>
			<store arg="90"/>
			<load arg="83"/>
			<iterate/>
			<load arg="90"/>
			<load arg="88"/>
			<call arg="91"/>
			<store arg="92"/>
			<dup/>
			<getasm/>
			<load arg="92"/>
			<get arg="38"/>
			<dup/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<call arg="94"/>
			<if arg="99"/>
			<load arg="88"/>
			<call arg="91"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
			<load arg="88"/>
			<pushi arg="19"/>
			<call arg="98"/>
			<store arg="88"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="100" begin="23" end="23"/>
			<lne id="101" begin="21" end="25"/>
			<lne id="68" begin="20" end="26"/>
			<lne id="102" begin="30" end="30"/>
			<lne id="103" begin="28" end="32"/>
			<lne id="104" begin="38" end="38"/>
			<lne id="105" begin="35" end="39"/>
			<lne id="106" begin="33" end="41"/>
			<lne id="69" begin="27" end="42"/>
			<lne id="70" begin="45" end="45"/>
			<lne id="71" begin="45" end="46"/>
			<lne id="107" begin="57" end="57"/>
			<lne id="108" begin="55" end="67"/>
			<lne id="109" begin="70" end="70"/>
			<lne id="110" begin="71" end="71"/>
			<lne id="111" begin="70" end="72"/>
			<lne id="112" begin="68" end="82"/>
			<lne id="72" begin="43" end="88"/>
			<lne id="73" begin="91" end="91"/>
			<lne id="74" begin="91" end="92"/>
			<lne id="113" begin="103" end="103"/>
			<lne id="114" begin="103" end="104"/>
			<lne id="115" begin="101" end="114"/>
			<lne id="75" begin="89" end="120"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="9" name="116" begin="54" end="82"/>
			<lve slot="8" name="117" begin="48" end="88"/>
			<lve slot="7" name="118" begin="44" end="88"/>
			<lve slot="9" name="119" begin="100" end="114"/>
			<lve slot="8" name="117" begin="94" end="120"/>
			<lve slot="7" name="118" begin="90" end="120"/>
			<lve slot="3" name="54" begin="7" end="120"/>
			<lve slot="4" name="58" begin="11" end="120"/>
			<lve slot="5" name="60" begin="15" end="120"/>
			<lve slot="6" name="64" begin="19" end="120"/>
			<lve slot="2" name="52" begin="3" end="120"/>
			<lve slot="0" name="17" begin="0" end="120"/>
			<lve slot="1" name="120" begin="0" end="120"/>
		</localvariabletable>
	</operation>
	<operation name="121">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="122"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="121"/>
			<pcall arg="51"/>
			<dup/>
			<push arg="123"/>
			<load arg="19"/>
			<pcall arg="53"/>
			<dup/>
			<push arg="124"/>
			<push arg="125"/>
			<push arg="56"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<pcall arg="57"/>
			<pushf/>
			<pcall arg="67"/>
			<load arg="29"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="126" begin="25" end="25"/>
			<lne id="127" begin="25" end="26"/>
			<lne id="128" begin="23" end="28"/>
			<lne id="129" begin="22" end="29"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="124" begin="18" end="30"/>
			<lve slot="0" name="17" begin="0" end="30"/>
			<lve slot="1" name="123" begin="0" end="30"/>
		</localvariabletable>
	</operation>
</asm>
