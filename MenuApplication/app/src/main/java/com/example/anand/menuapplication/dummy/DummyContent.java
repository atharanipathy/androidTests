package com.example.anand.menuapplication.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "Code Board Tech","http://www.codeboardtech.com/"));
        addItem(new DummyItem("2", "google","https://www.google.com/"));
        addItem(new DummyItem("3", "gmail","https://www.gmail.com/"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;

        public DummyItem(String id, String content, String url) {
            this.id = id;
            this.content = content;
            this.url = url;
        }

        @Override
        public String toString() {
            return content;
        }

        public String content;
        public String url;




    }
}
