package sushant.lldPatterns.factoryPattern.documentParser.factory;

import sushant.lldPatterns.factoryPattern.documentParser.enums.ParserType;
import sushant.lldPatterns.factoryPattern.documentParser.parser.CsvParser;
import sushant.lldPatterns.factoryPattern.documentParser.parser.JsonParser;
import sushant.lldPatterns.factoryPattern.documentParser.parser.Parser;
import sushant.lldPatterns.factoryPattern.documentParser.parser.XmlParser;

public class ParserFactory {

    private ParserFactory(){}

    public static Parser getParser(ParserType parserType){
        switch (parserType) {
            case CSV:
                return new CsvParser();
            case XML:
                return new XmlParser();
            default:
                return new JsonParser();
        }
    }
}
