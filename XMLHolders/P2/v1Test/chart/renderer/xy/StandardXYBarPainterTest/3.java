@Test
    public void testSerialization() {
        StandardXYBarPainter p1 = new StandardXYBarPainter();
        StandardXYBarPainter p2 = (StandardXYBarPainter) 
                TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

}