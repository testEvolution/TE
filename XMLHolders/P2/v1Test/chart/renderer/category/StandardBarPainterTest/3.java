@Test
    public void testSerialization() {
        StandardBarPainter p1 = new StandardBarPainter();
        StandardBarPainter p2 = (StandardBarPainter) 
                TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

}