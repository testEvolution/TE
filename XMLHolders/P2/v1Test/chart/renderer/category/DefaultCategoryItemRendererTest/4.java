@Test
    public void testSerialization() {
        DefaultCategoryItemRenderer r1 = new DefaultCategoryItemRenderer();
        DefaultCategoryItemRenderer r2 = (DefaultCategoryItemRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

}