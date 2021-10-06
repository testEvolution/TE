@Test
    public void testSerialization() {
        CustomPieURLGenerator g1 = new CustomPieURLGenerator();
        Map<String, String> m1 = new HashMap<>();
        m1.put("A", "http://www.jfree.org/");
        g1.addURLs(m1);
        CustomPieURLGenerator g2 = (CustomPieURLGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}