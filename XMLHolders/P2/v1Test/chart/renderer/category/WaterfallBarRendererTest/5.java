@Test
    public void testSerialization() {
        WaterfallBarRenderer r1 = new WaterfallBarRenderer();
        WaterfallBarRenderer r2 = (WaterfallBarRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

