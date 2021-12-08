import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayEightTest {

    DayEight dayEight = new DayEight();
    @Test
    void partOneSample() {
        int actual = dayEight.getCountOfUniqueSignals(sampleInput);
        int expected = 26;
        assertEquals(expected, actual);
    }

    @Test
    void partOne() {
        int actual = dayEight.getCountOfUniqueSignals(input);
        System.out.println(actual);
    }

    @Test
    void partTwoSample() {
        int actual = dayEight.getOutputValue(partTwoSample);
        int expected = 5353;
        assertEquals(expected, actual);

    }

    @Test
    void diff() {
        String largerString = "bcdf";
        String removingChars = "cf";
        String actual = dayEight.difference(largerString, removingChars);
        String expected = "bd";

        assertEquals(expected, actual);
    }

    @Test
    void hasAllCharactersTrue() {
        String larger = "abcdfe";
        String smaller = "bfe";

        assertTrue(dayEight.hasAllCharacters(larger, smaller));

    }

    @Test
    void hasAllCharactersFalse() {
        String larger = "abcdfe";
        String smaller = "bfez";

        assertFalse(dayEight.hasAllCharacters(larger, smaller));

    }

    @Test
    void partTwoSampleLarger() {
        int expected = 61229;
        int actual = dayEight.getOutputValue(sampleInput);
        assertEquals(expected, actual);
    }

    @Test
    void partTwo() {
        System.out.println(dayEight.getOutputValue(input));
    }





    private String sampleInput = "be cfbegad cbdgef fgaecd cgeb fdcge agebfd fecdb fabcd edb |" +
            "fdgacbe cefdb cefbgd gcbe\n" +
            "edbfga begcd cbg gc gcadebf fbgde acbgfd abcde gfcbed gfec |" +
            "fcgedb cgb dgebacf gc\n" +
            "fgaebd cg bdaec gdafb agbcfd gdcbef bgcad gfac gcb cdgabef |" +
            "cg cg fdcagb cbg\n" +
            "fbegcd cbd adcefb dageb afcb bc aefdc ecdab fgdeca fcdbega |" +
            "efabcd cedba gadfec cb\n" +
            "aecbfdg fbg gf bafeg dbefa fcge gcbea fcaegb dgceab fcbdga |" +
            "gecf egdcabf bgf bfgea\n" +
            "fgeab ca afcebg bdacfeg cfaedg gcfdb baec bfadeg bafgc acf |" +
            "gebdcfa ecba ca fadegcb\n" +
            "dbcfg fgd bdegcaf fgec aegbdf ecdfab fbedc dacgb gdcebf gf |" +
            "cefg dcbef fcge gbcadfe\n" +
            "bdfegc cbegaf gecbf dfcage bdacg ed bedf ced adcbefg gebcd |" +
            "ed bcgafe cdgba cbgef\n" +
            "egadfb cdbfeg cegd fecab cgb gbdefca cg fgcdab egfdb bfceg |" +
            "gbdfcae bgc cg cgb\n" +
            "gcafb gcf dcaebfg ecagb gf abcdeg gaef cafbge fdbac fegbdc |" +
            "fgae cfgab fg bagce";

    private String input = "gbdfcae ebcg cfg gc facegb fecab acfge cbfgda fedag caebfd | ecbg bfcagd faegc gcf\n" +
            "eacgf efcab fgc fedagc gdeaf cged aebfgd adcgfbe gc bdgcaf | fgbacd cfega ecdg cg\n" +
            "dfgae gcadef efb eb dcabf bgde edfba bcfaeg egcdfab fbgade | bged eafdb eb gfdea\n" +
            "aefdb cafdgeb egdfac egdcba fcbd efd eadcb caefbd df aegbf | cfadeg abfedgc fde bfcd\n" +
            "dc deafg ecd dbaefc adcfeg cfged ecbfg acdg cafdegb gfeadb | dcga edc adfebcg ecgfb\n" +
            "befdc bcfge befad degfab cde aecbfd gcedaf eafcgdb dc bcad | bdeafc cde ebdcafg daebgcf\n" +
            "cd egdacfb fdc fecgb gabdf fbcdg fcgdeb gdcfea debc ecfbga | gfecb fbgecd bcgef dc\n" +
            "fagcdbe gec gbdea ce bgedc aecd cgbeaf cfbdg gebcda dbfgae | cfbaged cgbeaf ceg gadfbe\n" +
            "gcbaf gfdb bdafc df adf adcbefg dcfeag cebad adfgcb faecgb | afd agfedc dcbfa gdfabc\n" +
            "fbae cef fecdbg afbcg cefbga fe acdfgb gadce fbdacge fcage | fe abef gfbac cef\n" +
            "cfdebg bg beg cabfeg fbgd acged ecgbd fdcbe cfbeda cebgadf | fbedc gadce gdaec bcfed\n" +
            "gba ab fgbcd gedaf bcadge afbdgc cdgfbe agdfcbe bcfa bdfga | gab gdbfc ba fgdbcae\n" +
            "fabdgce bfdgac cbaed dcb bgade fbaec fcde edbfac gfabec cd | dc cefd dc cd\n" +
            "afc dbecafg fagce fbega fbgc edgca agecbf bafged eacdfb cf | cf bfdcaeg gfbc gfbc\n" +
            "gedcb ebda cgbdfa fcaeg gab bfgdce ba agbce bdgecfa dgebca | bdgfce cebagd cbdgfae dcfbeg\n" +
            "egbacf acdfe gfecb egdfcb dfgaceb dfb dgcb fdbce db bdeafg | fdb db db bdf\n" +
            "cfeg eabcf gdefcab bef geabc bfcad egbadf cfgbae egcdba fe | fgec gaecfdb cagbef ef\n" +
            "bafde dbgeac feacgbd cbaef bed bfgaed gafecd bgdf bd eafgd | db cfgdae caegdfb fabed\n" +
            "afg bacg cdbgf gcdfab fdcae gafdeb dbgfce ga dcafg cedabfg | gaf bdafgc agbc ga\n" +
            "edgca bafdcg acbdg cbdeag dce fgcea gdcfeb aebd ed gfdabce | ebgcad daeb edcga ced\n" +
            "agecf abfegc dbefcga ad dafc fegdb adg afgde bdcega ecagdf | fadeg dfac dga da\n" +
            "ceagdb gedac acfdbg cda bgecafd adgeb dcefg ca beac abgfde | aegbd baegd bdcagf abcdeg\n" +
            "egaf bagdce dcgabf ea eab cgbfa cdfebga fbcae dfcbe fgbace | gdfaceb gfea dbcfe eba\n" +
            "cfbega bge eg cgdebaf gedbc adeg bceadg bfadcg agbcd cdefb | ge ge cfedb fbgadec\n" +
            "afc ca cabe gbefcd aebcgdf acedf gbafdc eagfd edcfab dfbce | gbfdcea fca aecbfd ceba\n" +
            "af bcdag agbfde fdbca ebdfc adf dbefcga abedfc aefc dbgcfe | af acfe adf adcfbe\n" +
            "badfe agebd gfaced gbdcafe aecfd fab dbfc geacbf adbcfe bf | fb ebagfc beadf dface\n" +
            "bfeda gabefd agbedc ec fcadeb dfbaecg cea fdec afceb agfcb | fbcae cfde eac fedc\n" +
            "ebcf eafgcb egdfba dfcag bacge faceg afe gdceab ef dgcbaef | fcbe febc bcaeg cbfe\n" +
            "dafbc afdebg egfc ce eagbcd ceafgbd fgeba cbefa eac fcgeba | afegb cdagbe cbdaf gfaeb\n" +
            "ecd dface cdgafe gcabfd edbgcfa gdacf fecg cdbaeg ec efbad | edbaf gcafd dcgbaf dafgceb\n" +
            "gd fagbec bdfg gde cfgbe cefdbg gbdeacf agdcef bdceg bcdea | dg gcfeba dg ebdcg\n" +
            "bg bgdeac abdg cgb fcbade gdbceaf fbdgce dbeca gaebc aegfc | cgb befgdc fedgcb gbc\n" +
            "gac cgeda egcbafd gfdbce fadec ag degbca agecbf dagb gebcd | cdegb degcbaf cedaf edafc\n" +
            "ecfab bfacdg bdga gb cfgba bfg gefdacb cegdfb fagdc cafedg | bfg cefba gb aedbcgf\n" +
            "dgfce aeg cfbdgae acfgeb ebcafd ag gafed gaebfd bdga dbfea | gae cfbdae abedfg bgfdae\n" +
            "cgbad cbaf fbgeda dfgcab fdcebg dbfcg decag cdagbfe bga ab | dfcabg cbfa fcedgab adfcbeg\n" +
            "cegbadf edfgba cafeg dc agdebc dbgfe cdbefg dec dbcf edfcg | bdfc facdegb adfegb egbfd\n" +
            "bedf cefadg ced ed bcegd gefabc agcdbfe cdgab gcfbe fgcdbe | ed cde bdgec dbecfg\n" +
            "egfcab debfa ecd bfgec cdgb cd bdcef dgebcf ecdabgf egcadf | becfd cbgd gcdb fcbed\n" +
            "bc dbfge gbecf caefdg gefabc abgdcf bfc baec efcag cebgafd | baec fegbc agfec cgbef\n" +
            "bacegfd fbdgca egbcf fabce bdaefc dcaef dagefc ba dbae cab | daeb cbefa cab ab\n" +
            "fgab cgdfae fcgebd gb bcg dbaegcf cabed gadcb gcafd gbfadc | gbc adcgf dgecbf cgb\n" +
            "gdaeb df cgaebdf dfbe cbdagf eabdcg gfd aecgf aefdgb agedf | dfg gfcea febd ebdag\n" +
            "ecbaf cagfdb aecgf gac ebga defagcb baedfc gfcde ag gfbeca | cadbfg gaecbf agbfec fecba\n" +
            "edbgaf fbd egdbfca dagf gabde bdfge fd bgcfe efbcda eacdbg | fbd ebcdaf dbgaefc gefbda\n" +
            "acdbg aefcdg cdg cegb acebfd abgdf cg fbegadc gcbdae eabdc | gc edafbcg gadbc cg\n" +
            "fgcd bgdafe bacge dg facgde acfde agdec gdefbca deg aebcfd | gd eagdc ged ged\n" +
            "egfa efdcba dfbgc cbfea ga abcfg edgcab bga fecgdab aebfcg | bga faegcbd bfeadc badcge\n" +
            "bfeda ceagdb bf ebfacd edacb acefbdg begcdf bafc agfde feb | fb fb fbac bcegad\n" +
            "bfdcea dcbgaf cbega dbage cea ce cbafg gefc bgacfed bfecag | abgfc ec cegf acdefb\n" +
            "adgfce cdag cd fgecab cfgae ced fdbae gebdfc agbcefd ecafd | dfcae dc fdcae ebafcg\n" +
            "dbeag begfad bfdegac dcb cb gcfda ecdgfb ceab gcabd dcebag | cbd cb cegbda bgcdef\n" +
            "cdfaeb fgebad ea dcbgfa gcaebdf cegbd bdcae fabcd cfae eba | caef bafdce afec gfdbea\n" +
            "bcfega gcbea bdfgeca gabcd bd gdcabe dafcg ecdb dba ebfadg | fceadbg fbaceg db bd\n" +
            "gadcbe dgb debcaf fabgcd bcgfe bdgcf acfedbg gd cafdb gdaf | eafdcb bcfade badceg bdacfg\n" +
            "gafce cabde cdf aefbdgc efacgd fgeacb ceafd df efgd badfgc | edfg acbegf dfc gedf\n" +
            "afgce gbdecf bae adebcgf bgedca abecg abcd baefgd ba gbdec | ab dfagcbe gbeca ab\n" +
            "de dcgaf gcfbed gdebfca acegb cde bcgafe abed gdacbe gecda | ed afgcedb deagc gcdaf\n" +
            "gcdef ebfadc da dabefg daf fbaeg gaefcb dfeag gbdfcea bgad | gadfbe bafgce dgba afd\n" +
            "bdfeg gecf fc egdfcb gcbedaf bfc dfcbe cbdfga baced abedfg | fcge fgdecb dcgfabe fgdeb\n" +
            "bdf acbdfg bdaefg aefgbc abcde dagebfc fd dfcg cabdf cgfab | bfadc cabfg gfcdab fbaegc\n" +
            "af cdfbega edbfac dfbgc fac adef adecb becagd acdfb efcbga | bcagfde bdfcae gfdecab eacbd\n" +
            "egfcad bdgeac fdac fed cdage fd gcbfed baegf gfedcab gedfa | adceg fd afebg egdca\n" +
            "fegba ecbafgd cfegba cgdab efbgad ec fadcge ecg bcef cegba | bgadc ce fecgdba baceg\n" +
            "bdfaeg abgedc efadg bafd gfeba fcdebga adg aecgbf da ecfdg | ad ad dfba befcgad\n" +
            "efadcg dacfb cfgab bfde eafdc decfbag decbfa bd bcd acebgd | debf cafde gcdafe fcgebad\n" +
            "agd cgadef gcdebfa gd facge bdfgea eagbfc dcgaf cafdb ecdg | cbgfae ebfcga agcef bfdeag\n" +
            "dfbge abefgd aefbcg dcfegb ba fgbad gedafbc bdea fba dcafg | agfdb fab fba fcbgde\n" +
            "fcdab agbecd eacgfb gc fgeabd gdabc dgbea cbfdeag cag dceg | fcadb fbcad degba gca\n" +
            "eag cbefg dfeagbc cdfbga egcba dcegba dace agedbf ae gadbc | cegba age agbdc dbcafg\n" +
            "cdbag gfb dgceba cbfa gfdbac faebcgd deafg dgbaf fbegcd bf | eagdf febgcd fbdag gdfbce\n" +
            "cdbgf afcebg acfdbe ed ced bdefagc dcgbea fbeac cbdfe adef | cfbde de dec ecd\n" +
            "dfc fbcde dfcbga ecbgd egbdca fd eabfc edbfgc efdg cdfegab | df dgef fgbaedc df\n" +
            "fcg egcbd gacefb dfgbc abfcgde bfdga cfed cf gdebac gbecdf | bfdcg fgc fbcdg agdbf\n" +
            "fcabg acfbedg bfcgde ecbad agef ecfgba ecf fe dafbgc baecf | aegfbc cfe dbace fec\n" +
            "edbagc cefbda bfdeg af agcf gfebdca fgdcab dgcba baf fabdg | bcadef dfgcab abdcfe gedfb\n" +
            "acegf efbgcd dgbefac cgd bedga cbad agcedb dc egadc feagdb | badcgef cd dcgbfae cd\n" +
            "bfc cdafeb bcega gdcf afgdbe egbfd caebfdg gcefb cf debcgf | gcebf bgedf dfbgea fc\n" +
            "dgfaceb gcdf dabcg fd dfgba aefcbd bdacge gfabe afd dcagbf | daecgfb gbecda dacbfe gdcba\n" +
            "fbgedc bfcda cfg dafbge fecdbag cagfd aecg agfde cg adgcfe | ecdfagb gfceda gaebdf gbfdea\n" +
            "afbe gfa gfdcb af febcadg faegcb bcgea aedcbg eagfcd afgcb | bagcf gfdeca abfe af\n" +
            "caefg efd fd abedc fcgd egdcaf egafbd gfcbea dafec abgedcf | gaebcf fcedga def egcafbd\n" +
            "dcfab gefdcb bda da baefc baedcfg gfda dbceag cbfagd fbgdc | cdebga efdgbc fbcgead beafc\n" +
            "bgfed fdaegcb bedagc da bdacfg gda eacfgb cadf dafgb cabgf | dgceab da dfbeg bcegad\n" +
            "cedab fc adbfec faegcb adbgf cfa ecdf ebagcfd dcbfa ecgabd | becdaf cefd abdfc efcd\n" +
            "cdgbea aeg agdec dafgbc gbed aegbcf ge aecfbgd cagbd cafde | ceafd bagcd gacdb cgbad\n" +
            "dgfeb bedag cgdefa df gfdaeb cbdega gfdceba gbfec dafb gfd | fabecdg bdfa bdaf dfba\n" +
            "gdfe acdbf ed bdegcf cegbfa cebfd deb badegfc fbcge bgaced | ebd efgcabd bfcda dfeg\n" +
            "abfcedg gec fcgdbe gaebc gebfac efbdca gfea acbfe gbdca ge | agfe cge cdbgfe bcfdea\n" +
            "fgbaed dacegb dacef egafd aecbgf adfcebg bdfg ged agfbe gd | agdfceb gd dg fbgd\n" +
            "egdb acgbef edfac bd fgecb gbadfec bcafgd bcd bedcf gdecbf | bdc bedg gdbe efbgc\n" +
            "cagbef acgbf fgcabde cgd gbda dg dbfgec ecafd dgfca dagbcf | agbcfe dcgfa dbagcf cgdafeb\n" +
            "cb efbgc cgfae cgb gceafd beca fbcgae gefdb cbgadf dcfabeg | bgeacf bacedfg cbdgfa dfgbe\n" +
            "cgbedf facgdb agfdc cga cafed gfcbd gcdbeaf degacb fbag ag | gbaf acfed gafcd cgfda\n" +
            "egbdfca cadf bdafgc cbgfea cbgde bdcfg gfc cf fdbag gebdfa | eacdgfb fcda dfac adefcgb\n" +
            "fdgea abcd ac cfabge cdbfeg gdebac acg gcdebaf gadce bcedg | gac abefgc ac gcaed\n" +
            "eafdc eafbc agbe begcadf ba gcefba fgcbda gdbfce cba ecbgf | ba ab abeg adcgbf\n" +
            "afg ga bdafe eadfg dagc gefcab edbcgf ceagfd ecgdf aedcbfg | agdc daefb debcafg fdaeb\n" +
            "baf cbdgf afbecd gdcabfe dcfabg fadeg gbac gbadf ab cedgbf | fcdeba cbga afbdg bgca\n" +
            "ebdfgca ebfdag gb bgf fdeagc gdbe cdfgba egfab abcef agdfe | gb gfbdea gdeb eafbg\n" +
            "agbcdf fe gebad fea becf ecfbga cgabf aegfb fedgca acgbedf | ebgda ebdgacf fcbe aef\n" +
            "gdbef bgfadec gfeab eab gdcfbe ab bfadeg fdab dcaebg acgfe | fgadbe fbedgc dgefb aeb\n" +
            "adcbf fbdg bcf dcbag fecad cgafbd fb acdefgb bgefac dgcabe | dfcab cfb bf cdeaf\n" +
            "dfgbca cdebagf cfe fcbga aefdg geafc bdecgf ce bgefac aceb | bace aebc gfbac efc\n" +
            "adfegcb gcbaf fa adgcb acf efgacb fgcbed eadfbc agef fbgce | aefg acf gafe cfa\n" +
            "fdegbc fcbad ec ebgaf gecfdba feacb caefgb degfba ecb geac | ecb ecb cfadb ebafc\n" +
            "fegabc ebcgafd gfacde ge fcgeb ceg bagcf dcfbe ebga bdcfga | cefabdg fdceb abgcf gfeadc\n" +
            "fdabcg bgafc fcbeag edbfg gadfceb ad adb dfca dcbgae dfabg | bdegf faedbcg da caegfbd\n" +
            "cgfae gdbeca decaf fd dfbc fad dabegf daebc bedafgc efbcda | decfa fgcbdae fcbead dbegcaf\n" +
            "dbeaf cb fabecdg bcfda gabfdc cbfg agdfce abc edgcba cgadf | bcdefag bcgf dafbc badcgf\n" +
            "gbdcfa becfdg fdbcgea fgc cg fecdg efdgb ecadf gceb gadefb | gcbe fgcebda daecgbf aebcfgd\n" +
            "cdega dgcaeb cbgea egdcaf gfacedb begfda cebfg cbda bag ba | ab egdac beafdcg faegcdb\n" +
            "gab cgfab cfage fbaedc bcdg gb gacfbd defcagb gdebaf fadbc | bg fbacde gfabc dceagbf\n" +
            "ge ebg cgdfb cedba bedgc ecag deagcb bfceda gdcfeab egdbfa | bge beg bafged cadbeg\n" +
            "eabd ebacf ecd fdcbg dbafegc ed ceagdf fgceab ecfbda cdbef | dec dfcabe dec befca\n" +
            "afbgdec cedb dc agdbf cegbf bfcedg cdg bdgfc baecgf ecfdag | cd dgefbc fdgcb cd\n" +
            "gebdaf dgfae afe gafcbed agcfd febd edabg gbfeca bcdega fe | ebdag fedb egafd aegcbf\n" +
            "gebdcf abefdcg deg bgdfc fcde gbfea gedabc edbgf ed bgfcda | efdbg fedacbg gbfacd fbdeg\n" +
            "bcgd edagc gaebd bcdaeg fabedc bgefa fcadge agbfcde db adb | cgbdfae bdagcef badegc dab\n" +
            "df fdb bfadceg bgeadf afbdce efdg dgbae dafbg cafbg abdgec | gdfe afcgb ebcgafd fbgacde\n" +
            "gabce gdfaeb bcad cebdgfa fgcbae efgcd dga da cgdea cdeabg | ad agd gda gfedc\n" +
            "fcabge edbfg fcaebd ea dcbagef gace gafcdb bafcg eaf fgbea | dcfbage aceg afbdceg ebcafd\n" +
            "bafe egfcda be bfgaec gbe egcfbad fcaeg bdcaeg bgecf cfbdg | fabgced bfea gbcef gcfeb\n" +
            "badfeg fgecb af cgaebd acfdbge gaf afcged gfaeb dfab egbad | fa fga abfd gabde\n" +
            "afceg bcdfge fcaebg baegdcf cfg eabcdg bgfa efcad gcabe fg | abfg gf fbgecd acebgd\n" +
            "acbedgf fb efgdc bgf gbcfd bgfdac dagcb fdbeag ebcdga fcab | bf gdebaf fb bf\n" +
            "aecf cgbdefa bacged efbcga fdgcab febag af agf dgfeb ecabg | bcgdaf af cadfbge efca\n" +
            "egfda fgceab acd bfcadeg dc dcega bfdcea gcdb cdbega eacbg | gabecd cd befgcad gdcb\n" +
            "gecda dfegacb cgfae cdbfag fcbeag afg gf fbge dafecb caebf | dfaebc cfeab gf agdfbc\n" +
            "gdafe cdgaeb egfdba da bfdgec gbfed eagcf egdbafc fbad dag | agfde dga dcgbfe abcdfeg\n" +
            "acgdb gadfce cbefdga becad bcegdf bacgdf afbg ga dag dbcgf | abdgc gdeacf acdfbg ecdab\n" +
            "gdfa eadbc gcafe dgc dg fcagde bcgfea decgfb egcda fbecagd | cegda cgdea gd dg\n" +
            "ga egdbcfa aegcb cag egbcd gadceb gbcefd decafg badg cabfe | bagd cagfed gacdfeb cbegd\n" +
            "cb deafc bcgd agfceb dbfega ecb deacb aebgd cbafdge ebdacg | dcgb adceb edgba ceb\n" +
            "edgfab acgb becfdag bgf cgbdf cgfad dacbfg bg ecdbf afegdc | gfb bg gcfade gfbdeac\n" +
            "caebg cgaf acgdfbe begcaf cf fdgeb agedcb ebgfc cfe fbcdea | dbfeagc cfe fbeagdc cf\n" +
            "ageb bg adcbfge fcgea cbgaef cbdfa gfb fedacg bfgca fdcgeb | fbg afdcb ecgbdfa cgfdbe\n" +
            "dgbfe aeg ea dcea dbeagfc fbacgd ecbdag gadbc bcafge adgbe | aedc ae gbdef daec\n" +
            "dbafcg dbgaefc adfc egdab fdg df agefbc bdgcfe fbacg gdfba | bedgacf gcbaef cdfgab cafd\n" +
            "eg fdgcabe gcadbe aebdc gced bagfde gea gbeac afbcg ecdbaf | agfbc fgdabe fcdgaeb feabcd\n" +
            "fedb gfe defabgc caedg cgadbf feagd bdagfe fgbda efagbc ef | fe fgcbea ef dbfe\n" +
            "bc agcb dfceg bafgdc gfabd fbdcg bcd ecgfbda ebadgf fbaedc | cbd fabcgd cgbfd bc\n" +
            "ebfgc dbeg ed gefdc cde gfbecd fgdca caedfb gdbafec gefcab | fgdecb dgfce fbecg cabgfe\n" +
            "ab ebda bfagdc becgd aecfg bag daecgb ebcag gbacdfe cfgbde | abedgc eafgc ebacg ab\n" +
            "ecdbag dagbfe badef fcaed adc cd efbagdc cafge cfaebd dfbc | dcfb dca acd gcdabe\n" +
            "cedbgaf ecbfg dagfec dgbea bdca gfdaeb ecgbd dbecga cd edc | ecbdga cde edbag dc\n" +
            "egbfcd gbcafe ed defga dbgfa bcgdeaf cdea def eacdgf gacfe | bgfad ecda gbfad gcdefb\n" +
            "dafge cea fdace agdc dbgfea ebdfgca dcbfe acedfg abecfg ca | defac gcad ac ca\n" +
            "ecdba fbac eabcdf beadgfc acd efacgd ac agedbf bfdea ecgbd | aecbd agbefd bdgec dgebc\n" +
            "bfegda bdage gdf gfdae bdfgace fgeb afdec fgdacb gf deagcb | fbaegcd fegb aedgb dfg\n" +
            "cdaf fd bcdfge agebf dcgfae gfead baedcg gdcea egdbacf dgf | efgab df eagfd afgbe\n" +
            "egfca egcb ceafdb fbc fbcaeg dgbfa cdfeagb fgcba agdcef cb | cb gcdfae eabgfc fgbca\n" +
            "gdbca fdecba gdecfb feagbd ceb adfbgec bdgec ec efgdb cfge | ec ecbgd dacefb abfged\n" +
            "edbcag cabd ecfdgb aegfd eagfcbd ac cga feagcb ebdgc dgeca | acfbdeg dfgea cga dgeca\n" +
            "ebgacf adcf bcgedfa gdcabe abedf aef edabc fa befgd bfdaec | aefdb af cebad fae\n" +
            "dageb de gde dgfbce cgdba gabefd afbge cgdebfa aefd ceafbg | efgbda agbdecf bfaegcd edg\n" +
            "ce dec becf efdgb edfgcb ecbdag gdaefb beafgdc dagfc fecgd | ce fdbage gcdfeba gbcadef\n" +
            "ecgfa ebadcf ed gcdfab cdefa gfdaeb dbec dbfgace cdbfa dfe | dceb cdfab ed ceagf\n" +
            "cadg efgcdb gbcfad feabc agfcb afcdgbe dgbfa gcb fagbde gc | gdecbf adfgbc fbcgade gafbc\n" +
            "gdcefa gefdb bcfeg eabc fagdbc ecagf bcf afcebg cb bfgaedc | fcgdba agbecf fcgeba fgdceab\n" +
            "afgbc be cbeaf gfeb ebcdfag cfdbag cdfae cfegba cbeagd abe | gdecbaf cagfb bfgaec cabfdge\n" +
            "eb egdb dcagb abe gcdabe agbce dgabcf fedbca fdcebag gfeca | gdbe agdcb gfcae cgadbf\n" +
            "dbagc bcaedfg gade cadeb efgabc cabedg gca fgdbc ecafdb ag | dage cagdb dgcaeb cdgab\n" +
            "gbecd eacdg cgb egacdbf gfdbec efbg bfced bg bdfcea bafgdc | acbfde bg gb gb\n" +
            "fgbadc fbdag dbecg fbae dacgef ega ae afcbged ebgfad bgaed | ae bacfgd bfea agdbef\n" +
            "dacfeg gecfd ad gadbfe gadbfec gda acde fcedgb acbfg fdcag | gefcd cdegf agd ad\n" +
            "caegbd cfdeba edbac cfbegad fe fbea fdagc cef acdef bedgcf | ef cdafgeb fce edfca\n" +
            "dgcae cedbfag facbdg fdc eacdbf bfegda dfcae fdbae cf cfeb | cf febgcda dfc cdf\n" +
            "edfag dbeacg dbecafg agc gcefa gc bcfea cdfg fbdgae gefadc | dfacge fagbecd feacbdg bfaged\n" +
            "abefdg fgdec ecadf efcdab ac dbeaf acdb acf cdegfab gecbfa | fca fdbega decaf cgafdeb\n" +
            "bceafd fegcad edcagbf dbcage decba bafd df fcd bcfge cbfed | ebgfc eacbdf gadebc df\n" +
            "egba cgdafbe begfc gacdfb dceaf cefbdg gfa ag gcebaf aecfg | acbgfd gabe fbgeac agfec\n" +
            "cdgeb fdecag agdbefc gefbac cdaf ade fegdab cgead ad caefg | ecbgdaf dgceb cfgae dea\n" +
            "cafbde fbgac edcg agdfeb eg dacgef fgcea aefdc dceagfb eag | afgec fbcga ceafgd bgceadf\n" +
            "cefbg ceabd gd edbacgf aedfbc gaedcb cdbeg abfdcg gdc gead | cgd dgea gd cebad\n" +
            "fadbg dagecf fea fbecga adce ae bedfcg egacbdf fdgec fdage | dcae caed dbefcg adgfb\n" +
            "acged aec efgdcb ac fagc abdge abfdegc fdeacg cfaedb gedfc | egbcafd gaefcdb cae cagdfe\n" +
            "fcbdage bafgec cab fcbae ac abdegf dbfec fbgae eagc cbfadg | acb dafegb acb bfeagdc\n" +
            "af egfda gebdf gebdfa aefcdbg fbecda fgba daf cdeag dgbcfe | eagdc cefbgda daf daf\n" +
            "dgebcf gcf agcbd fbecd fbcdg ebacgf aebfcd fdeg fegdabc fg | dacgb dfge fcdbe gedf\n" +
            "bfacdg gafcb gefbd cd dgcfb dagc bdfagec bceadf fagceb bdc | begfd gbdfe afgcdbe fbeacgd\n" +
            "bagf afe bdcaeg fdcbe af dafbe cbedgaf gfebad gdaeb aefcdg | baedcgf fa af cgadbef\n" +
            "acdgf becgfa acd cagbf agcdbe fdba da bdcfag gfdec dcgafeb | bagfc da dca fdbacg\n" +
            "cdabfe adbfc ecbaf cdae cdbfge dabgfc bfgae bec ce gadcbef | faecbd beadcfg dcae cgfedab\n" +
            "bceag agd aced gdbafce bcfgae agdeb ad fabdcg fdbge egcbad | gaceb agd bdagec da\n" +
            "cag dfgbeac ecdbgf ag gfabc ebag fabgec deafgc adcfb fcegb | dgaecf aebg bgea dcbfa\n" +
            "afdb degbc agedcf da aed beacfg dgfecba efcab bdface cbdea | fbeca aecbd gdecaf ade\n" +
            "cafebg afedcb gfeabcd fgcb cfa afdeg fc ecgab dacebg cfeag | bcgf bgcae gdfea bgcf\n" +
            "feg gfcaed cfabdge gf degafb fdegc edfcab edgbc agcf cfade | gf gf gacf egf\n" +
            "ceadf ecdgf eacbd cebagd dcabfge eaf fdceab fbad fgebca af | cefadb cefad bfad abedc\n" +
            "gefabd cabdfeg dgceab dagef bdfacg egfdc edgab af feba fda | geadcb dagfceb fda af\n" +
            "dfcea adgce dfebc gecfdba fadgbe dcefga cfga aebcdg efa fa | fa fae af gaedbf\n" +
            "agbfd acbgedf faecb cegbad dgabfe gbc fcdg cfagb gc afdbgc | cg cg dfgbae cdfg\n" +
            "efg bfacg feab efcagd fe bcagedf edgbc ebgcf afbegc bcfgda | dgecfa ef fgcba efba\n" +
            "aebfdc bcfage dgbacf gface gbaecfd dfgce geab acfbg ea eac | cabfg ea cfagb eagb\n" +
            "gba gdcea cdbfg acgdb gbecadf bfgecd dgcfab abfc ba fdeagb | ab febagdc dfgbac fdagcb\n" +
            "dfcb gcebd dfgaec efdgc eagcb dfaebg afedcbg gbd gbcfde bd | gadebfc db febdga bgd\n" +
            "eabd adcbg ceafg ecb be eacdbg acegb gbfcde adgcbf ecfdgba | cgfebad cbe ebacg dfgceb\n" +
            "cefbgd cgdfa bagfced dabe fgceab abfeg gdbaef gbfad db gdb | aefdgb bd abdfegc fgabed";


    private String partTwoSample = "acedgfb cdfbe gcdfa fbcad dab cefabd cdfgeb eafb cagedb ab |" +
            "cdfeb fcadb cdfeb cdbaf";
}
