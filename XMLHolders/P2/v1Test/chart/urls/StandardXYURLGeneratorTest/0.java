@Test
    public void testSerialization() {
        StandardXYURLGenerator g1 = new StandardXYURLGenerator("index.html?");
        StandardXYURLGenerator g2 = (StandardXYURLGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

    