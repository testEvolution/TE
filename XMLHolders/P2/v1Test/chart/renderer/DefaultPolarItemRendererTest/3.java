@Test
    public void testSerialization() {
        DefaultPolarItemRenderer r1 = new DefaultPolarItemRenderer();
        DefaultPolarItemRenderer r2 = (DefaultPolarItemRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

}