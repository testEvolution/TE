@Test
    public void testSerialization() {
        StackedAreaRenderer r1 = new StackedAreaRenderer();
        StackedAreaRenderer r2 = (StackedAreaRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

}