@Test
    public void testSerialization() {
        MinMaxCategoryRenderer r1 = new MinMaxCategoryRenderer();
        MinMaxCategoryRenderer r2 = (MinMaxCategoryRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    