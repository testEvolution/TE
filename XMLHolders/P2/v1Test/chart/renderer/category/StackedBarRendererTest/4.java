@Test
    public void testSerialization() {
        StackedBarRenderer r1 = new StackedBarRenderer();
        StackedBarRenderer r2 = (StackedBarRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    