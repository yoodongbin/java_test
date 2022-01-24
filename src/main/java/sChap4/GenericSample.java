package sChap4;

public class GenericSample {

    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
//        sample.checkCastingDTO();
        sample.checkGenericDTO();
    }

    public void checkCastingDTO() {
        CastingDTO dto1 = new CastingDTO();
        dto1.setObject(new String());
        System.out.println(dto1.getObject());

        CastingDTO dto2 = new CastingDTO();
        dto2.setObject(new StringBuffer());

        CastingDTO dto3 = new CastingDTO();
        dto3.setObject(new StringBuilder());

    }

    public void checkGenericDTO() {
        CastingGenericDTO<String> dto1 = new CastingGenericDTO<>();
        dto1.setObject(new String());

        CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<>();
        dto2.setObject(new StringBuffer());

        CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<>();
        dto3.setObject(new StringBuilder());
    }

}
