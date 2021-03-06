import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayTenTest {

    DayTen dayTen = new DayTen();

    @Test
    void partOneSample() {
        int actual = dayTen.sumOfSyntaxErrors(sample);
        int expected = 26397;

        assertEquals(expected, actual);
    }

    @Test
    void partOne() {

        System.out.println(dayTen.sumOfSyntaxErrors(input));
    }

    @Test
    void partTwoSample() {
        long actual = dayTen.completeLines(sample);
        long expected = 288957;
        assertEquals(expected, actual);
    }

    @Test
    void partTwo() {
        System.out.println(dayTen.completeLines(input));

    }




    String input = "<{([{(<[(<[({<{}[]>([]{})})((<{}[]>{[]{}})([(){}]<()<>>))]>)({([<{<>[]}(<>[]>>][([()[]]{[]()})<(<>{}\n" +
            "[[[[[({(([<[[([][])<<>()>]{<[]{}>(()<>)})(<<<>[]>{<><>}>(<(){}><[]()>))>](([(<{}[]>(()()))<<{}{}\n" +
            "[[[<(([([<{<<<<><>>([]{})>{{{}()}<[]()>}><[{{}{}}(<><>)]>}<(({{}()}(<>[]))({[]()}[[]]))(<[[]()](())>({{\n" +
            "(([<{<<[[<{(([[]]<<>>){([]{})<(){}>})}>{{{[<<>[]>([][]>]}}[{[{<>[]}[<><>]][[<>()]({}())]}(<{[]}[()[]]><\n" +
            "[<<[{{({[{{[<<<><>>[{}<>]>[<<>{}>(()[])]]}}<[(<<{}[]]([]<>)>)[[{<><>}{()()}]<<<>()>>]]<({(<>{})}[{\n" +
            "[<{<({{[[<<<[([]{}){[]<>]][<<>{}>]>{[[[]<>][<>[]]]}>>{[[<(()())<<>[]>>[{{}[]}{[][]}]][[([]())<()<>>][([]<>)<[\n" +
            "<{<{<[(((<((<[()<>]<[]()>>{<<>()>(<>[])}))>)[([(([()]<{}[]>)[{<>()}[[]{}]])<<[[]<>][{}]>{[{}()]([]<>)}>\n" +
            "([{[{(({{((([{[]()}[[]()]])[<({}<>){<>{}}>{{{}[]}{()()}}])[[((()<>)[<><>])[({}<>)({}())]]]}[[[[<<>()>[{}[]]]\n" +
            "[[[<[<{[(<<(({[]<>}(<><>)){[()<>]})>><([[<[]()>]([<>[]]<()[]>)]{({{}()}<[]<>>)[({}<>)<<>{}>]>)[<({{\n" +
            "<{{[[[<([<<<(<[]()>)([<>[]]<{}{}>)>[[[[][]]](<()[]>[()[]])]>>]{{[(({<>()}{<><>}){(()<>}[[]{}]}\n" +
            "{<{<((([<{<{[{[][]}{[]()}][({}[]){{}[]}]}{((<><>)(<>{}])(<{}()><<><>>)}>(<{{<>{}}{()()}}>[<(<><>)[<>\n" +
            "<{[<<[([[<<{[<<>[]>](<{}()>)}[(<<>{}>{{}[]})<[(){}][[]()]>]>>]<{{[<{()()}{()[]}>[(<>[]){()()}]][{(\n" +
            "[[<<(<{{<{{{([{}()][[]]){{()[]}((){})}}[[[<><>]{<>}]{[<>[]]{(){}}}]}(<([()()][()()]){{()}([]())}>)}[[\n" +
            "[<[{<((<{{((<{{}<>}[{}()]>[{[]()}{[]<>}])({[()()]}[{<>>([]{})]))}<((((<>{})(()<>)){{[][]}})){[{<<>[]>[{}{}\n" +
            "[[([<{[[((<(<<{}{}>><{[]<>}>){<<()<>>[{}{}]>}><{[[()[]]{()()}][(<>{})]}{{{[][]}<[]()>}(<<>[]><(){}\n" +
            "[[{<{[<<(({(<[[]()]<[]()>>([(){}]<{}>)){<[[]{}]{[]<>}>{<[]{}>[()<>]}}}{(((()){{}[]}){[<>{}]{[]()}})[({[]{}\n" +
            "([<{{(({{<<<<({}[]){(){}}>{({}[])<[][]>}>[{(()<>)([]{})}(<[]()><{}[]>)]>({{{()[]}{(){}}}({()()}<[]{}\n" +
            "<[({{({{{(([{(<>()){[][]}}[([]{})<[][]>]]{<[<>[]]<<>{}>>[[{}<>][{}[]]]})<([(())[()<>]](([]())[(){}]\n" +
            "(<[<<<{{<([{[(<>{})(()<>)]([{}]{[][]>)}({{()[]}}((()()){(){}}))]([({()}[[]<>]){{<>[]}(()())}]<{[[]()]{{\n" +
            "({{((<(([{{[<[{}{}][[][]]><[{}()]{[]{}}>]{<[<><>](<><>)>[{[]()}<<>[]>]}}<[{{[]{}}<(){}>]{{<>}<()<>>}][((<>\n" +
            "({(({<<{(<<<[(()<>)((){})]<[<><>]<<>[]>>>([{(){}}{<>()}][({}())])><{<<<><>>(()())>{{{}()}[[][]]}\n" +
            "({((<{((({<<<[{}{}][[]()]>[<{}<>>{{}<>}]>(<[[]<>][{}[]]>>>[[[<()>{()<>}]<{<><>}<[][]>>]{<(<\n" +
            "{<<<[{(<{([{<<()()>((){})>}([[()()]](<<>())([][])))]({[({}<>){[][]}][(<>){<>[]}]}[{[{}[]]<[\n" +
            "[[[{{[{((([{(<{}()><{}[]>)<{{}[]}[()()]>}{{{<>[]}[()()]}(([]{})[()()])}][<(({}())({}()))(({}<>)[{}\n" +
            "<[{({[{[([[<(<(){}>{<>{}})>(([()[]]<[]{}>)<{{}()}{()<>}>)]][[<(<[]{}><()()>)[[()()]<(){}>]><[<()()><{}<>>]>\n" +
            "[({<{[(<{([[[<[][]>{[]{}}]{{(){}}[{}()]}]{[(<><>)[<>{}]]{{[][]}}}])}><<[[[{({}())((){})}({{}{}}{[][]})]({<[]\n" +
            "[{{(({[<[<({(<[][]>({}[]))[[()<>][()()]]})<[({<>}(<><>))[<<>[]>(<><>)]]<<[()[]]<<>()>>([()()]<[]<>>)>>>]\n" +
            "<[[<{([((<[<<<{}()><<>[]>>{{[][]}}>[{{<><>}({}{})}<[{}()]>]]>){[((((()()){(){}})[[{}{}]{[]()}]))(<(([\n" +
            "((<{{[(({(<([{{}()}{(){}}]<({}{})[[][]}>)><{{<()[]>({}())}<[<>[]]{<>[]}>}>)<<[[[<>{}](<>[])][{()}]]({(<>\n" +
            "<([[([{[<[[<<(<><>)<()>>>]]<[<({<>[]}<[]>)><<({}())<{}<>>><({}())>>][(([<>{}]{()<>})[[{}<>]{()[]}])({<()()>\n" +
            "[<[<[({<<({<{<[]<>>}[{<>[]}]>})>>}[<[(({([[]<>]<<>>)[<[]{}>]}))]>(([{<[[{}[]]<<>[]>]<{{}()}<[]\n" +
            "[<[[(<<{[{{<<(<>{})<{}()>><<{}<>>(<>())>><{([][])[{}()]}[{[]{}}{{}[]}]>}<<<({}{}}[[]<>]><[\n" +
            "<[{{([({[(<([(<>[])<[][]>][<[]{}>(<>)]){<[()<>]({}())>([{}()](()<>))}>(<{<<>()>[()]}>{{[<>[]]{()()}}{{\n" +
            "(<<{[([([<{[[{{}()}(<><>)){[[][]]}]({<(){}>{()[]}}<((){}){[]()}>)}>(<(<<[]<>>{{}}>)>[[(<{}<>>{(){}}){{\n" +
            "(((((<[<<([<<<[]{}>{<>[]}>(<[][]>[[][]])>])<<<{[<>[]]({}{})}[{()[]}<<>()>]>({<{}()><{}[]>}\n" +
            "(([[[[[{[[{(((<>{})([]<>))(([]{})<()<>>))({{<>()}{[]()}}<<()()>(()[])>}}<[[{{}{}}(<>{})]{[[]()]{{}<>}}][<{<>(\n" +
            "(<{{[{(((((<[<<><>>]>({(()<>)<{}<>>}{<<>[]>({}{})}))){<<<[{}[]][<>()]>><[<<>[]>]<[()()]<{}<>>>>>{[{{()[\n" +
            "[[({<[{{{<[<{({}<>)<<>{}>}({<>[]}([]<>))>[{(<><>){<>}}({{}[]}([][]))]]>{{<[<{}>(()<>}]{<{}<>><(\n" +
            "[<{{(<[<({[[{(<>()){{}[]}}[([][])<(){}>]]]<(<{{}{}}([]())>([[]{}]<[]<>>))<[<<><>>[<>{}]](([]()){<>\n" +
            "{{{<(<<([{({[<{}{}>[[]<>]]{{(){}}[[]{}]>}(((()())[<>[]])((()[])[(){}])))<{<[{}{}]>}{(<{}[]>{{}<>})<\n" +
            "(<<[<{{{{(<<(({}[])[()[]])<([]{})>>({({}())({}[])}{{<>[]}(()())}]>{[[[{}()]{<>()}]<(()())[<><>]>]}\n" +
            "[<{<{(([((<{[{[]<>}(()[])]}[[[()()]{{}[]}]<<(){}>{()<>}>]><((<[]><{}{}))[{{}<>}])[{([][])<[]{}>}\n" +
            "(<(<{[((((<(([()[]][<>()])<[[]]<{}[]>>)<<{{}()}([]<>)>({()()}(<><>))>>[([(()[])<[]<>>]{{()()}})[{(<>())[{}\n" +
            "[<{(<((<[[[[[{[]<>}<<>{}>]([[][]]({}[]))]{([{}()][<><>])}]{<[({}<>)({}{})]<((){}){<>{}}>>({[[](\n" +
            "([{[[<<[{(<(({[]<>}))><{[{{}<>}[()<>]]{{{}{}}<<>()>}}{({<>{}}<[]{}>)((<>{})([]{}})}>)<{[((()())(\n" +
            "({([{{<{[<[[<({}[])[[][]]>{{{}()}{{}[]}}]><{(<<><>>{[]()})[{<>()}[{}{}]]}[{[{}[]](<>())}([()]{{}<>\n" +
            "{{<{{{([(({<<[(){}]{()<>}>>({{{}<>}}{[<>()]})}[[[<{}()>(<>{})]<{{}<>}>][(({}())<<>()>)(({}<>){[]()})]]))[({<\n" +
            "{{<((((<{{[([(<>())(<>[])])([[(){}]{<><>}]{<<>{}>({}())})]((({[]()}(<>()))(<[]{}>[{}<>]))<([[]()]{<>()})<\n" +
            "(<[(([<{({<<{[<>{}]<[]()>}([<>{}}(<>()))>([<{}<>>[(){}]])>}){<[[{{[]{}}({}())}{<(){}>{()[]}}]{([[]{}]<{}[]>)\n" +
            "[[{[{<<((<[((<{}()>({}<>)))({([]<>)}({{}[]}(<>{}))}]{<<{(){}}>{[[]{}]([]<>)}><<[{}{}]<[]{}>>\n" +
            "<<<[<[<([[{<{((){}){<>()}}[[{}()]((){})}>}[(<<{}{}>[<>()]>{(<>{})[()<>]})[[(()<>)[[]()]][(()[])<\n" +
            "[<((([{{([{<[<[]<>>(()())]<[()()]{<>())>><<[{}[]]<()<>>>[([]()){[]()}]>}{<([{}{}]<(){}>)[{<>{}}(\n" +
            "{[[[([((<[[({({}{})[<><>]}[[<>[]]((){})])(<(()[]){{}<>}><<{}<>>([]<>)>)]]([<[{<><>}[{}<>]]\n" +
            "(<[[[<([[[[{{<()<>>{()<>}}{[[]{}][{}<>)}}<({()[]}([])){(()[])({}())}>](([{{}[]}{<>{}}](([][])([][]))))]]<{\n" +
            "[[({<<{{{<(<{<()[]>[[]<>]}{({}<>)}>(([{}<>]{{}[]})))>}([[{[[<><>](<>[])]}({<<>()>})][{{{()()}{[]()}}(({}[])(<\n" +
            "[{[{{<{(<((<{[{}[]][<><>]}{<(){}>[[]{}]}>))<{[[<()[]><(){}>]<{[]<>}[()()]>]{(([]{})<[]>)(([\n" +
            "([{{<[[[<{<<<{[]}{<>()}><[()()]{[]<>}>>[{[<>()>[<>()]}[[[]<>]{<><>}]]>(({[()()]{<><>}}[(<>\n" +
            "[(<[[<<{{(({[<{}()>][{[][]}{{}<>}]}[<<<><>>>{([]<>){[]<>}}]))<(<[[()()][()()]]({(){}}[(){}])>{<(<>[])<{\n" +
            "<[(<<{{[[{(([<<><>>{()()}]({()()}{{}{}}))<[{()()}<()()>]([{}[]]<[][]>)>)>]{(<[(({}())[[][]]){({})<\n" +
            "<({<{<(<<[<[[[{}{}][[]{}]][{[]{}}{{}<>}]]><<{[{}{}]([]{})}([[]{}])>{<(<>{}){[]<>}>{{{}<>}([][])}}>](\n" +
            "<[[[<(({[<<<({<>()}{[][]}>{({}<>){()}}>[{{<>[]}{()()}}[<{}[]>[<><>]]]>[<<(<>{})>([()<>][{}\n" +
            "(<({{(((<{{({[{}<>){[]<>}}[({}()){{}[]}])[{<[]{}>(<>())}([()[]](<>()))]}{{(<()()>){{<>()}}}[{[\n" +
            "[(<<<(<{(<{[{[[]()]{<>[]}}]{{[{}()][<><>]}<([][])<{}>>}}><{<<[{}()][<>()]}{({}<>)(()())}><<{{}()}<{}\n" +
            "(({<{[[{<<<[[<()()>[[][]]]{{<>()}{()()}}]<(([]{})[[][]])>>>{[<[<[]()>[()[]]]<([]())(()<>)>>]<({{(){}}{\n" +
            "{{[{{<[[[({{(({}[])[{}()])([{}()]{()<>}>}[[[<>()]{[][]}]{<()()>[<><>]}]}(<{[()()]({}<>)}[{()<>}{{}[]}]\n" +
            "{<[[[{([(((({([]<>)}[[<>[]]]){[(()[])([][])]{[()]<<>{}>>})[[{(<>[])[{}()]}{{{}()}([]<>)}]{<<<>{}>([\n" +
            "<({{([<<{<[((<(){}>{<><>])[{[][]}{{}{}}])]({[{{}[]}{()[]}][[()()](<>{})]}{(({}{}){[]()})})>}>>](<{\n" +
            "[{{{(<<{<<<[(<{}<>>)]>><[{(<[]{}>{{}<>})[[<>{}]]}([[()()]<{}<>>])]<([<()[]>{{}{}}][[{}[]]<[]{}>])>\n" +
            "<[(<[[<[[({[(({}())([]()))<[[]{}](<>{})>]{<<[][]><{}{}>>{[<>{}]([]())}}}){((({[][]}{<>[]}){[{}{}\n" +
            "[((<<[[<[{{(([<><>])({()[]}<[][]>)]}}]<<([{[()()]<[]<>>}<[{}[]][<><>]>])<<<[<><>]<{}[]>>{{[][]}}>{<{<>[]}<()\n" +
            "<{<[(<[({[<<(<{}{}>{{}{}})<(()<>){(){}}>][{<{}><<>()>}[(()[])<()()>]]>][[[{{{}<>}((){})}][([()[]]\n" +
            "[((((<{[{{{<{(<>{})(<>[])}<[(){}][[]<>]>>>}}(<((<({}[])<()<>>>)(<[()[]][<>{}]><[[][]](()<>)>))((\n" +
            "{[[<<[(((([(([<>[]]{()()})([<>[]]((){})))]{{[<{}<>><{}<>>]<{{}[]}(<>[])>}})<[([{{}()}((){})]{(<>{})<[]>})([<[\n" +
            "<{(<<[(<<[{{(([])[<>{}])((()<>){[][]})}}]({([<{}>[[][]]](<(){}>{<>()}))[[<[]{}>](<()()>[()<>]\n" +
            "[<({{{[(([{<({()()}<()<>>)<{<>{}}>>(<<()>[[]()]>[{()<>}<[]{}>])}]<<{<[<>[]]([]<>)>}><{{[<>()]({}(\n" +
            "<<<({{({{[([[([]{})<()()>]<<<>()><[]()>>]({<[]()>[{}<>]}{{<>{}}{()()}}))<({((){})[[][]]}(({})<\n" +
            "((<<{<[[([{(<((){})<<>[]>>{[[][]]<()[]>}){<(<>()){()[]}>[[[]<>]([]<>)])}]((<{{[]<>}{[]<>}}>\n" +
            "({({{{(<<{<<([{}{}](()()))((<>{}){[]{}})>([[()<>]](([]())<[]{}>))>{[((()()))<((){})([]<>)>]((<\n" +
            "<{{[[([{<{([<[()[]]>([()<>]([]))]<{{()()}{[]<>}}{{{}[]}<()>}>)<{[([]<>){()<>}][[()()][(){}]]}(({<><>\n" +
            "{<{{({[[{<([{[()()][()<>]}[([]{})(<>())]))<<[(<>[]){{}()}][<<><>>[[]]]>>><{<<[()[]]({})>[[[]]<(\n" +
            "(<[{{{{{<{<((({}<>)[<>()]))([<<><>>[()[]]])>}>([[{{[[]{}]<<>()>}}{({[]{}}([]{}))}>[(<({}()){()()}>\n" +
            "<(([[([{<<{(<<[]>{()[]}>{[[]<>]<<><>>}){[<[]()>[<>{}]][([]{})<<><>>]}}>>{{<[<{[]<>}([]{})]{({}<>){\n" +
            "<<{(<{<(<([{<{[]<>}>({[]()}{{}()})}<[{<>()}{<>()]]<<[]()>{()()}>>]<(([[]]{()()})[{{}[]}{{}}])(([{}\n" +
            "<[<{[([[({<[[{()[]}({}[])]]([<<>{}>(<><>)]<([]())[{}<>]>)>[(((()){{}[]})(<[]>(()<>)))<[<<><\n" +
            "<({{<<<<<<[<[{<>[]}[<>{}]]<<()()>{()}>>[<({}[])((){})>[<[]<>>[[]()]]]]>{{{[[[]{}](<>())]}}({(({}()){<>}\n" +
            "({(<{[<<{[([{[[]()]<(){}>}<{()()}<(){}>>][([()()][<>[]])<([]())(()())>])]({[<<[]<>>{[][]}>\n" +
            "[[(([<{<(<<[{{{}[]}[{}<>]}{<[]<>>[(){}]}]<{<()[]>{{}{}}}{{<>[]}{(){}}}>>{<[{()[]}{[]}]{{{}}{{}<\n" +
            "{{({<<({[<{([[{}{}][{}<>]][([]{})<{}()>])<[[<><>][[]()]]{(<>{})<{}[]>}>}>{<([[{}{}](<>[])]{{<>[]}\n" +
            "<((((({<([<({[()<>]([]())}({(){}}{<><>}))([[{}<>]([]<>)])><([<()()>[()<>]][[{}<>][{}()]]){[[<>[\n" +
            "[(<<[{<[([(({[[]{}][[][]]}[([]<>){()}]){[{{}{}}{[][]}]{{()[]}[<><>]}}){(((()[])([]())))[[[{\n" +
            "{{([<{([(<[(<<[]>{[]<>}>({<>()}<[][]>))]<<<[{}<>][{}{}]>[<()<>><{}{}>]><(<{}()>{<>()})[<()<>)([][])]>>><[<[\n" +
            "<{[[<{<{<<[{<[[][]]<(){}>>{([]())[<>()]}}[[<()<>>({}{})]{([]<>){[]()}}]]>>}<{{({(({}{})<<>()>)[([])([]{})]})\n" +
            "{[{{[[{<<{<[[<<><>>[<>[]]]<<{}<>><<>()>>]([[{}<>][{}[]]]([(){}]<<>()>))>{{<(()[])((){})>([{}<>]{<>()})}\n" +
            "[(((<{[({<{[<([])<[]{}>><(()<>){()<>}>]<[({}<>)({}[])]<(<>)({}{})>>}>}]][(<({(<<[][]>>([()\n" +
            "([<{<[<[{[<{<<<>{}>>{<<>()>[{}[]]}}<[{{}{}}[[][]]][(<>[])[{}[]]]>>{[[(<><>)[()<>]][({}<>)[<>(\n" +
            "<<{<([([<[{([(<><>)<<>[]>][((){})(<>[])])<([()[]]{[][]})(({}<>)<(){}>)>}([{({}{})<<>>}[{(){}}[<>{}]]])][((\n" +
            "[<<<((<{{{({[[[]{}][<>[]]]}{[{()[]}<{}{}>]<(<>{})(()<>)>})}(<<<[(){}]{[][]}>([{}<>]{()[]})>><{{<[]<>>{{\n" +
            "{{[<<(<{(<(<{((){})([]())}(({}{})<{}{}>)>[[{[]}<[]())]{<{}{}>(()())}])<([(()<>)[()[]]]((()())([][])\n" +
            "{(<<[(([{[<{({[]<>}(()())){<<>()><()()>}}<[(<>[])<<><>>]{[<>[]]<{}[]>}>>]}<{<<{[(){}]({}())}[(<>())]>\n" +
            "(({{(<{[{{[<<[(){}]<<>[]>>((<>())<()()>)><(<()[]>)<[[]{}]<<>>>>][{(<()()><<>{}>)<(<><>){[]{}}>}]}})([(<<[<<>\n" +
            "{({(<[[{([{(<{()()}<<>()>>)<(<{}[]}{(){}})[{[]<>}[[][]]]>}<[[[<>[]]<<>()>][[<>{}]]]<<(()[])([]\n" +
            "[({[[{<({[{[<<<>{}][[]()]>]}][(({((){}){(){}}}[[[][]]<[]()>])([([][])[(){}]]))]})>}[(<({{[<({}{";


    String sample = "[({(<(())[]>[[{[]{<()<>>\n" +
            "[(()[<>])]({[<{<<[]>>(\n" +
            "{([(<{}[<>[]}>{[]{[(<()>\n" +
            "(((({<>}<{<{<>}{[]{[]{}\n" +
            "[[<[([]))<([[{}[[()]]]\n" +
            "[{[{({}]{}}([{[{{{}}([]\n" +
            "{<[[]]>}<{[{[{[]{()[[[]\n" +
            "[<(<(<(<{}))><([]([]()\n" +
            "<{([([[(<>()){}]>(<<{{\n" +
            "<{([{{}}[<[[[<>{}]]]>[]]\n";
}
