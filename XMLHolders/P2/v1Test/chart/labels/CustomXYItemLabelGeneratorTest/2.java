@Test
    public void testSerialization() {
        List<String> t1 = new ArrayList<>();
        t1.add("Tooltip A1");
        t1.add("Tooltip A2");
        t1.add("Tooltip A3");

        List<String> t2 = new ArrayList<>();
        t2.add("Tooltip B1");
        t2.add("Tooltip B2");
        t2.add("Tooltip B3");

        CustomXYToolTipGenerator g1 = new CustomXYToolTipGenerator();
        g1.addToolTipSeries(t1);
        g1.addToolTipSeries(t2);
        CustomXYToolTipGenerator g2 = (CustomXYToolTipGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}