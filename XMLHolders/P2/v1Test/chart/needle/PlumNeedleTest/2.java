@Test
    public void testSerialization() {
        PlumNeedle n1 = new PlumNeedle();
        PlumNeedle n2 = (PlumNeedle) TestUtils.serialised(n1);
        assertTrue(n1.equals(n2));
    }

}