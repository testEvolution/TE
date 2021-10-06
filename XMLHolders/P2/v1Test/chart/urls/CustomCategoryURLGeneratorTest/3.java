@Test
    public void testSerialization() {

        List<String> u1 = new ArrayList<>();
        u1.add("URL A1");
        u1.add("URL A2");
        u1.add("URL A3");

        List<String> u2 = new ArrayList<>();
        u2.add("URL B1");
        u2.add("URL B2");
        u2.add("URL B3");

        CustomCategoryURLGenerator g1 = new CustomCategoryURLGenerator();
        g1.addURLSeries(u1);
        g1.addURLSeries(u2);
        CustomCategoryURLGenerator g2 = (CustomCategoryURLGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

    