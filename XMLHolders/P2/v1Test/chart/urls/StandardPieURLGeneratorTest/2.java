@Test
    public void testSerialization() {
        StandardPieURLGenerator g1 = new StandardPieURLGenerator(
                "index.html?", "cat");
        StandardPieURLGenerator g2 = (StandardPieURLGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

    