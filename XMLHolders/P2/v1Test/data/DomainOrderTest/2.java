@Test
    public void testSerialization() {
        DomainOrder d1 = DomainOrder.ASCENDING;
        DomainOrder d2 = (DomainOrder) TestUtils.serialised(d1);
        assertSame(d1, d2);
    }

}