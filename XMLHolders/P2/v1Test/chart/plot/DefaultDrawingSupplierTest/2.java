@Test
    public void testSerialization() {
        DefaultDrawingSupplier r1 = new DefaultDrawingSupplier();
        DefaultDrawingSupplier r2 = (DefaultDrawingSupplier) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

}