@Test
    public void testHTMLEscape() {
        assertEquals("", ImageMapUtils.htmlEscape(""));
        assertEquals("abc", ImageMapUtils.htmlEscape("abc"));
        assertEquals("&amp;", ImageMapUtils.htmlEscape("&"));
        assertEquals("&quot;", ImageMapUtils.htmlEscape("\""));
        assertEquals("&lt;", ImageMapUtils.htmlEscape("<"));
        assertEquals("&gt;", ImageMapUtils.htmlEscape(">"));
        assertEquals("&#39;", ImageMapUtils.htmlEscape("\'"));
        assertEquals("&#092;abc", ImageMapUtils.htmlEscape("\\abc"));
        assertEquals("abc\n", ImageMapUtils.htmlEscape("abc\n"));
    }

    