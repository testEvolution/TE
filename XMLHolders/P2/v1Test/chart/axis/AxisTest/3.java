@Test
    public void testSerialization() {
        Axis a1 = new CategoryAxis("Test");
        AttributedString label = new AttributedString("Axis Label");
        label.addAttribute(TextAttribute.SUPERSCRIPT, 
                TextAttribute.SUPERSCRIPT_SUB, 1, 4);
        a1.setAttributedLabel(label);
        Axis a2 = (Axis) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

}