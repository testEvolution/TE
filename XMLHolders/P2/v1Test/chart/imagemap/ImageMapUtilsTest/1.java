@Test
    public void testJavascriptEscape() {
        assertEquals("", ImageMapUtils.javascriptEscape(""));
        assertEquals("abc", ImageMapUtils.javascriptEscape("abc"));
        assertEquals("\\\'", ImageMapUtils.javascriptEscape("\'"));
        assertEquals("\\\"", ImageMapUtils.javascriptEscape("\""));   
        assertEquals("\\\\", ImageMapUtils.javascriptEscape("\\"));
    }

}