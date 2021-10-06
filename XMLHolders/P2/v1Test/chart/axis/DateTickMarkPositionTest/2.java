@Test
    public void testSerialization() {
        DateTickMarkPosition p1 = DateTickMarkPosition.MIDDLE;
        DateTickMarkPosition p2 = (DateTickMarkPosition) TestUtils.serialised(p1);
        assertEquals(p1, p2);
        assertTrue(p1 == p2);
    }

}