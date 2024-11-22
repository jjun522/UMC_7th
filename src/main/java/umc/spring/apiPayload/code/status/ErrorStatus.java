package umc.spring.apiPayload.code.status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import umc.spring.apiPayload.code.BaseErrorCode;
import umc.spring.apiPayload.code.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public enum ErrorStatus implements BaseErrorCode {

    // 가장 일반적인 응답
    _INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON500", "서버 에러, 관리자에게 문의 바랍니다."),
    _BAD_REQUEST(HttpStatus.BAD_REQUEST,"COMMON400","잘못된 요청입니다."),
    _UNAUTHORIZED(HttpStatus.UNAUTHORIZED,"COMMON401","인증이 필요합니다."),
    _FORBIDDEN(HttpStatus.FORBIDDEN, "COMMON403", "금지된 요청입니다."),

    // 음식 카테고리 관련
    _FOOD_CATEGORY_NOT_FOUND(HttpStatus.NOT_FOUND,"FOOD4001","잘못된 요청입니다"),
    Store_region_NOT_FOUND(HttpStatus.NOT_FOUND,"STORE40001","잘못된 요청입니다"),

    Mission_STORE_NOT_FOUND(HttpStatus.NOT_FOUND,"MISSION40001","가게를 찾을 수 없습니다"),

    User_NOT_FOUND(HttpStatus.NOT_FOUND,"USER40001","이용자를 찾을 수 없습니다"),

    Mission_ALREADY_IN_PROGRESS(HttpStatus.NOT_FOUND,"USER40002","이미 진행중인 미션 입니다"),

    Mission_User_NOT_FOUND(HttpStatus.NOT_FOUND,"MISSION40001","이용자를 찾을 수 없습니다"),

    Mission_NOT_FOUND(HttpStatus.NOT_FOUND,"MISSION40001","해당 미션을 찾을 수 없습니다"),


    STATUS_ERROR(HttpStatus.NOT_FOUND,"STORE40002","status 갑은 1 아니면 2 되어야 합니다"),

    Store_NOT_FOUND(HttpStatus.NOT_FOUND,"STORE40001","해당 가게를 찾을 수 없습니다"),


    Review_STORE_NOT_FOUND(HttpStatus.NOT_FOUND,"REVIEW40001","가게를 찾을 수 없습니다"),

    Review_User_NOT_FOUN(HttpStatus.NOT_FOUND,"REVIEW4002","사용자를 찾을 수 없습니다"),
    // 멤버 관려 에러
    MEMBER_NOT_FOUND(HttpStatus.BAD_REQUEST, "MEMBER4001", "사용자가 없습니다."),
    NICKNAME_NOT_EXIST(HttpStatus.BAD_REQUEST, "MEMBER4002", "닉네임은 필수 입니다."),

    // 예시,,,
    ARTICLE_NOT_FOUND(HttpStatus.NOT_FOUND, "ARTICLE4001", "게시글이 없습니다."),

    // For test
    TEMP_EXCEPTION(HttpStatus.BAD_REQUEST, "TEMP4001", "이거는 테스트");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    @Override
    public ErrorReasonDTO getReason() {
        return ErrorReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(false)
                .build();
    }

    @Override
    public ErrorReasonDTO getReasonHttpStatus() {
        return ErrorReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(false)
                .httpStatus(httpStatus)
                .build();
    }

}