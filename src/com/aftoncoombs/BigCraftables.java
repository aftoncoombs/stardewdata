package com.aftoncoombs;

import org.json.simple.parser.JSONParser;

public class BigCraftables extends GameData {

    public BigCraftables(JSONParser parser, String filepath, int[] intIdx) {
        super(parser, filepath, intIdx);
        this.name = "Big Craftables";
        this.joinToObjectInfo = true;
        this.content[0] = new String[]{"ObjectId", "Name", "Price", "Edibility", "Type", "Category", "Description", "Can be set outdoors", "Can be set indoors", "Fragility", "Name"};
    }
}