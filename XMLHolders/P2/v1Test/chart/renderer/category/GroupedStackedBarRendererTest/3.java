@Test
    public void testSerialization() {
        GroupedStackedBarRenderer r1 = new GroupedStackedBarRenderer();
        GroupedStackedBarRenderer r2 = (GroupedStackedBarRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    