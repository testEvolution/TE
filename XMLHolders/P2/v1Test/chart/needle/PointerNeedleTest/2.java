@Test
    public void testSerialization() {
        PointerNeedle n1 = new PointerNeedle();
        PointerNeedle n2 = (PointerNeedle) TestUtils.serialised(n1);
        assertTrue(n1.equals(n2));
    }

}