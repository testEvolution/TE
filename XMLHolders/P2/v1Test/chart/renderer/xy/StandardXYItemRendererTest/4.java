@Test
    public void testSerialization() {
        StandardXYItemRenderer r1 = new StandardXYItemRenderer();
        StandardXYItemRenderer r2 = (StandardXYItemRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    